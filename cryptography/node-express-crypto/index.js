const express = require('express');
const app = express();
const crypto = require('./crypto');
const port = 3000;

app.use(express.json());

let dataStore = []; // Simulação de banco de dados

app.post('/items', (req, res) => {
    const { userDocument, creditCardToken, value } = req.body;
    const encryptedUserDocument = crypto.encrypt(userDocument);
    const encryptedCreditCardToken = crypto.encrypt(creditCardToken);

    const newItem = { id: Date.now(), userDocument: encryptedUserDocument, creditCardToken: encryptedCreditCardToken, value };
    dataStore.push(newItem);
    res.status(201).json(newItem);
});

app.get('/items/:id', (req, res) => {
    const item = dataStore.find(d => d.id == req.params.id);
    if (item) {
        item.userDocument = crypto.decrypt(item.userDocument);
        item.creditCardToken = crypto.decrypt(item.creditCardToken);
        res.json(item);
    } else {
        res.status(404).json({ error: 'Item não encontrado' });
    }
});

app.listen(port, () => {
    console.log(`Servidor rodando na porta ${port}`);
});
