const express = require('express');
const app = express();
const port = 3000;
const { validatePassword } = require('./validations');

app.use(express.json());

app.post('/validate-password', (req, res) => {
    const { password } = req.body;
    const validationResult = validatePassword(password);

    if (validationResult.valid) {
        res.sendStatus(204);
    } else {
        res.status(400).json({ errors: validationResult.errors });
    }
});

app.listen(port, () => {
    console.log(`Servidor rodando na porta ${port}`);
});
