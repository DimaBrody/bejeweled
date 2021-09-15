const express = require('express')
const app = express()

const scores = {}

app.post('/scores', (req, res) => {
    const headers = req.headers
    const score = headers.score
    const name = headers.name

    const currentScore = scores[name]

    if(score > 0){
        if(currentScore){
            if(score > currentScore){
                scores[name] = score
                playerAdded(name, score)
            }
        } else {
            scores[name] = score
            playerAdded(name, score)
        }
    } else console.log("Player", name, "not added, score is 0");

  

    res.status(200).send(scores)
})

const playerAdded = (name, score) => {
    console.log("Added player", name, "with score", score);
}

app.get('/scores', (req, res) => {
    var sortable = [];
    for (var score in scores) {
        sortable.push([score, scores[score]]);
    }

    sortable.sort(function(a, b) {
        return a[1] - b[1];
    });

    sortable.reverse()

    res.status(200).json(sortable)
})

app.listen(4000, () => {
    console.log("Server started on 4000");
})