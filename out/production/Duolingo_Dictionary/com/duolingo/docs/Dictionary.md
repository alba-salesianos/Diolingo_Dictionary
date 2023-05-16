# Dictionary

Esta clase cuenta con los siguientes atributos:

* Colección Map con colecciones Set para cada una de las listas de palabras, usando la inicial como elemento clave

Y con los siguientes métodos:


* addToDictionary: tras pasarle los parámetros para Lemma, Category y Definition, este método creará un objeto Word y, a su vez, creará una colección Set usando como clave la inicial de dicha palabra y la pondrá en el primer elemento de la colección Map.

---


* deleteWord: tras pasarle un String, el método buscará un objeto que tenga el mismo lema, y devolverá un mensaje en función de si puede eliminarla o no

---

* wordExists: tras pasarle un String, el método buscará un objeto que tenga el mismo lema, y devolverá un mensaje en función de si la encuentra o no

---

* displayWords: pasándole una letra como parámetro, devolverá la lista de palabras de dicha letra

---

* displayInitials: devolverá la lista de iniciales que existen en la colección Map

[Volver](../../../../README.md)