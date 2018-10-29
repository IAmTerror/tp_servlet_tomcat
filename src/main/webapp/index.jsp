<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>
<br/>
<a href="index.php">Click here for response by servlet controller</a>
<br/>
<br/>
<form action="calcul.php" method="post">
    <fieldset>
        <legend>Commande</legend>
        <p><label for="prenom">Pr&eacute;nom : </label>
            <input id="prenom" name="prenom"/></p>
        <p><label for="pu">Prix unitaire : </label>
            <input id="pu" name="pu"/></p>
        <p><label for="qte">Quantit&eacute; : </label>
            <input id="qte" name="qte"/></p>
        <input type="submit" value="Soumettre">
    </fieldset>
</form>
</body>
</html>
