# Notre premier sprint 
Le coeur de la méthode Scrum est le sprint. Il représente une plage temporelle d'une durée d'un mois ou moins durant lequel une version du produit potentiellement livrable est développé. La durée des sprints doit rester constante durant un effort de développment. Un nouveau sprint démarre immédiatement à la fin du sprint précedant. 

Un sprint contient le sprint planning meeting, les daily scrums, le travail de développment, le sprint review, le sprint retrospective. 

Pendant le sprint... 
 il ne doit pas y avoir de changement affectant le but du sprint
 la composition du team de developpment est constante
 les buts qualitatifs ne peuvent etre diminué
 le périmetre du sprint peut etre renegicier entre le product owner si des nouveaux elemets apparaissent durant le travail de developpment.

## Sprint Planning meeting:
 Le travail à réaliser durant le sprint est planifié lors de cette séance. La seance est limitée a une duree de 8 heure pour un sprint de 4 semaine. La durée sera ajustée proportionnellement si la durée est plus courte.
 
Le Product Owner présente dans un premier temps les users stories qu'il souhaite obtenir a la fin du sprint. Toute l'equipe travail ensemble a la comprention des problèmes posés. A partir des users stories et de l'experience des sprints passé, làequipe va se mettre d'accord sur le nombre et quel elements vont etre ajouter au sprint. Le but du sprint va ensuite etre defini. Ce but va etre le guide pour le sprint a venir.

Lorsque le travail du sprint est defini, le team de developement va traduire les divers points du product backlog en tache precise afin d'arriver au but. Les unites de travail devront avoir une duree de 1 jour ou moins. Le team de projet doit s'organiser lui meme pour atteindre les buts fixes pendant le sprint, et ce pendant le sprint planning meeting et tout au long du sprint. Le product owner peut etre présent dans cette deuxieme face pour repondre a des questions sur les fonctions a implementer. Si le team de developpement sàapercoit quàil a troop ou pas assey de travail pour le sprint a venir les abjectifs du sprint peuvent etre adapté.

A la fin du meeting le team de developpement doit etre en mesure d'expliquer comment il va atteindre les buts fixé pour le sprint a venir.

### But du sprint: 
Creer la structure de base de l'application avec quelques classes de bases, des tests unitaires, un mapping vers une base de donnees pour la persitence, utilisation d'un outil de versioning.

## Sprint Backlog:
| Story | Task | To Do | In Process | To Verify | Done |
|:-----------|------------:|:------------:|:------------:|:------------:|:------------:|
|  | créer le projet sur github 2h |  | |  | X 4h|
| |  modéliser architecture et technologie de l'application 2h | X | | |
| inscription d'un membre 8|  | X | | | |
|   | modeliser et coder classe Person 2h| | | | x 4h |
|   | cree entree DB class DAO Person 2h| |  | | X 2h |
|   | CRUD Person 2h|  |  | | X 2h |
| modérer les inscriptions 3|  | X | | |
|   | ajouterer attribut pour gestion login(password, userlevel,etc) à Person 4h|  | X | |  |
|   | ajouterer methodes admininistration users 2h| X | | |  |
| supprimer mon profil 3|  | X | | |
| ouverture d'un compte |  | X | | |
|   | modeliser et coder classe Account 2h| | | | x |
|   | cree entree DB class DAOAccount 2h| X | | |  |
|   | CRUD Account 2h| X |  | |  |
| supprimer un compte 8 |  | X | | |
| effectuer une transaction |  | X | | |
|   | modeliser et coder classe Bank 2h| | | | x |
| consulter l'historique des opérations |  | X | | |
| consulter le solde |  | X | | |

### Daily scrum
Le daily scrum est une seance d'environ 15 min qui permet la synchronisation du team de developpment. Et de creer un plan pour 24 heures. Il consite a analyser le travail qui a ete effectue depuis le dernier daily scrum, et de prevoir se qui va etre effectuer pendant le suivant. La seance a lui tout les jours au meme endroit et a la meme heure afin de simplifie la planification. Pendant le meeting chaque membre de làequipe doit repondre aux questions suivantes:
 quest'ce qui a ete realiser depuis le dernier meeting ?
 quest qui va etre terminer avant la fin du prochain sprint ?
 qu'elles sont les obsatacles potentielles ?
Le team de projet utilise les dailys scrum afin de surveiller la progression du sprint afin de garantir la reussite du sprint. Le scrum master doit surveiller que le daily scrum a bien lieu. Mais le team de developpment doit mener le meeting. Le scrum master surveille que la seance ne depasse pas 15 minutes.
Le daily scrum permet d'améliorer la communication au sein du team de developpment. Il elimine le besoin de faire d'autre seance, favorise la prise de decision rapide, améliore la connaissance projet de l'equipe.


## Revue du sprint:
Le sprint review a lieu a la fin du sprint. 