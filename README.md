# mySportsBets_Java
Projet JAVA (Licence Projet Web UPMC): Application qui permet de sauvegarder ses paris sportifs afin d'en avoir les statistiques.

Guide D'installation :

- Grâce à Git, importez le projet sur Eclipse ou autre (https://github.com/JulienHernanBarragan/mySportsBets_Java.git)
- Une fois le projet importé, veuillez ré-importer les librairies externes 
  (JfreeChart et MySQLConnector) présente dans le dossier lib_ext si elles ne sont pas détectés.
- Installez la base de données sql sur votre serveur,les config de log sont par défault (jdbc:mysql://localhost:3306/mysportbets_TP,"root","","")
  si elles doivent être changés, celle-ci sont dans le package databaseProcessing, class Connect_DB, public Connect_DB().
- Enfin lors du démarrage de l'application pour se logger le pseudo est profJava, son password est 123456.