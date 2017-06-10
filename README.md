mySportsBets
===================
Projet JAVA 2017 - 
Julien Hernandez, Laurent Perez



Guide d'installation
-------------
Grâce à Git, importez le projet sur Eclipse ou autre (https://github.com/JulienHernanBarragan/mySportsBets_Java.git)
Une fois le projet importé, veuillez ré-importer les librairies externes (JfreeChart et MySQLConnector) présente dans le dossier lib_ext si elles ne sont pas détectés.
Installez la base de données sql sur votre serveur,les config de log sont par défault (jdbc:mysql://localhost:3306/mysportbets_TP,"root","","") si elles doivent être changés, celle-ci sont dans le package databaseProcessing, class Connect_DB, public Connect_DB().
Enfin lors du démarrage de l'application pour se logger le pseudo est profJava, son password est 123456.


L'application **mySportsBets** est destinée à une utilisation personnelle. Elle permet de répertorier tous vos paris sportifs et génère une bankroll avec des statistiques annuelles et mensuelles. 

Les paris sportifs
-------------
Chaque pari sportif possède les caractéristiques suivantes :

 - Un ID généré automatiquement
 - La date à rentrer manuellement
 - Le nombre de matchs (permet de définir combien de matchs étaient sélectionné sur ce pari)
 - Le nombre de matchs **gagnants**
 - La mise totale
 - La côte totale du pari
 - Le gain total
  
La liste des paris sportifs
-------------
Les paris sont listés en page d'accueil et peuvent être triés par ID, par date d'ajout, par nombre de matchs, par nombre de matchs gagnants, par valeur de la mise, par valeur de la côte ou par valeur du gain. 

Depuis cette liste il est possible : 

 - D'ajouter un pari
 - De modifier un pari
 - De supprimer un pari
 - D'accéder à la Bankroll


La liste des paris sportifs
-------------
Hey! I'm your first Markdown document in **StackEdit**[^stackedit]. Don't delete me, I'm very helpful! I can be recovered anyway in the **Utils** tab of the <i class="icon-cog"></i> **Settings** dialog.

La Bankroll
-------------

La Bankroll affiche des statistiques sur la liste des paris sportifs. Elle affiche en premier temps l'évolution de la différence entre la somme gagnée et perdue sur l'année entière sous forme de graphique linéaire. 

La seconde partie de la page Bankroll affiche :

 - Le ratio entre les paris gagnants et les paris perdants sous forme de graphique camembert
 - La somme des mises et des gains sous forme de diagramme en barres
 - La somme de la bankroll 

Ces résultats peuvent être filtrés selon le mois choisi ou l'année complète.
