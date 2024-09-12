const express = require('express');
const app = express();
const port = 3000;
const { shortenUrl, redirectUrl } = require('./urlService');

app.use(express.json());

// Endpoint para encurtar URL
app.post('/shorten-url', (req, res) => {
    const { url } = req.body;
    const { shortUrl } = shortenUrl(url);
    res.json({ url: shortUrl });
});

// Endpoint para redirecionar URL
app.get('/:shortCode', (req, res) => {
    const { shortCode } = req.params;
    const originalUrl = redirectUrl(shortCode);
    if (originalUrl) {
        res.redirect(originalUrl);
    } else {
        res.status(404).send('Not Found');
    }
});

app.listen(port, () => {
    console.log(`Servidor rodando na porta ${port}`);
});
