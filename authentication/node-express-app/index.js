const express = require('express');
const app = express();
const port = 3000;

// Middleware para validação do token
function validateToken(req, res, next) {
    const token = req.headers['authorization'];

    // Token de exemplo para validação
    const validToken = 'vYQIYxOpyfr==';

    if (token === validToken) {
        next();
    } else {
        res.status(401).json({ error: 'Token inválido' });
    }
}

// Endpoints
app.get('/foo-bar', validateToken, (req, res) => {
    res.status(204).send();
});

app.listen(port, () => {
    console.log(`Servidor rodando na porta ${port}`);
});
