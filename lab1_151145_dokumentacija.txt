#Dokumentacija za prva lab vezba po SI 2019/2020

Evaluacija na SSH agent - eval `ssh-agent` Dobienoto agent id se dodava 
vo listata na known hosts so komandata ssh-add ~/.ssh/id_rsa

Za prevzemanje na pocetnoto repo se koristi git pull <SSH link od 
repository> Dokolku ne uspee dodavanjeto na ssh client vo listata na 
known hosts moze da se koristi i ssh-add <SSH key path>

Za promena na imeto na kloniranoto repo koristena e komandata mv SI_lab1_gr2/ ./SI_lab1_gr2_151145

Sopstvenoto repo e kreirano od mojot GitHub acc, public e.

Napraven e git pull na praznoto repo vo lokalnoto repo.

Za kreiranje na tekstualnata datoteka students.csv e koristena komandata nano students.csv
i so toa se otvara editorot, vo sportivno moze i so touch studnets.csv

Otkako ke se napravat promenite i zacuvaat, se stavaat site promeni na staging so komandata git add .
Potoa se commituvaat so komandata git commit -m "Ime na commit poraka".
Otkako ke se napravi commit, se pravi git push na branch master // master->master

Java fajlovite se editiraat so Eclipse/NetBeans, se dodavaat baranite promenlivi/metodi

Otkako ke se zacuvaat Java fajlovite, se stavaat promenite na staging, se pravi commit i push na prethodno objasnetiot nacin.

Kreiranjeto na nova granka se pravi so komandata git branch imeNaBranch.
Preminuvanje na druga granka se pravi so komandata git checkout <imeNaGranka>, vo nasiot slucaj git checkout facultyFeature.

Se kreira nov Java file so komandata touch Faculty.java i istiot se otvara preku Eclipse.
Otkako se pravat potrebnite promeni vo Java fajlot, se zacuvuva.

Promenite vo fajlot students.csv se pravat so komandata nano students.csv, se pravat baranite izmeni i fajlot se zacuvuva.
Promenite se stavaat na staging, se pravi commit i push.

Na GitHub se prikazuva posledniot commit i se pravi nov Pull Request. 
Pri kreiranje na Pull Request se odbira base branch, vo nasiot slucaj 
master, i branchot facultyFeature. Po zelba se dodavaat komentari i se 
kreira Pull Request. 
GitHub proveruva dali moze da se napravi avtomatski merge, toa znaci deka branchovite nemaat konflikti i moze da se mergnat.
Vo mojot slucaj nemase konflikti pomeju branchovite.

That's all folks ;)

GitHub repo: https://github.com/brsjak/SI_lab1_gr2_151145
Filip Brsjak - 151145
