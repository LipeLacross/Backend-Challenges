const express = require('express');
const app = express();
const port = 3000;
const fs = require('fs');
const path = './db.json';

app.use(express.json());

const getPoisFromDB = () => {
    return JSON.parse(fs.readFileSync(path, 'utf8'));
};

const savePoisToDB = (data) => {
    fs.writeFileSync(path, JSON.stringify(data, null, 2));
};

app.post('/pois', (req, res) => {
    const { name, x, y } = req.body;
    const pois = getPoisFromDB();
    pois.push({ name, x, y });
    savePoisToDB(pois);
    res.status(201).json({ message: 'POI created' });
});

app.get('/pois', (req, res) => {
    const pois = getPoisFromDB();
    res.status(200).json(pois);
});

app.get('/pois/nearby', (req, res) => {
    const { x, y, distance } = req.query;
    const pois = getPoisFromDB();
    const nearbyPois = pois.filter(poi => {
        const dist = Math.sqrt((poi.x - x) ** 2 + (poi.y - y) ** 2);
        return dist <= distance;
    });
    res.status(200).json(nearbyPois);
});

app.listen(port, () => {
    console.log(`Servidor rodando na porta ${port}`);
});
