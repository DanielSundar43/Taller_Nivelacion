# GIT

## 2. ¿Que es un repositorio en Git y como se diferencia de un proyecto normal?

Un repositorio en Git es un directorio que contiene todos los archivos de un proyecto junto con el historial completo de cambios realizados.  
La diferencia con un proyecto normal es que el repositorio permite controlar versiones, volver a estados anteriores y trabajar en equipo sin perder información.

---

## 3. Cuales son las tres áreas principales de Git?

- Working Directory: donde se editan los archivos

- Staging Area (Index): donde se preparan los cambios antes del commit

- Repository: donde se guardan permanentemente los cambios confirmados

---

## 4. como representa Git los cambios internamente?

Git utiliza objetos internos:

- Blob: almacena el contenido de un archivo

- Tree: representa la estructura de carpetas

- Commit: guarda un punto en el historial

- Tag: etiqueta un commit específico

---

## 5. ¿Como se crea un commit y que almacena?

Un commit se crea con: git commit -m "mensaje"

Que Almacena:
- Cambios realizados

- Autor

- Fecha

- Mensaje descriptivo

- Referencia al commit anterior

---

## 6. Diferencia entre git pull y git fetch.

- git fetch descarga los cambios sin fusionarlos

- git pull descarga y fusiona automáticamente

---

## 7. ¿Qué es un branch?

Un branch es una rama de desarrollo independiente. Git maneja las ramas como punteros que apuntan a commits específicos.

---

## 8. ¿Cómo se realiza un merge?

Se usa: git merge nombre_rama

Pueden surgir conflictos cuando dos ramas modifican la misma parte del cidigo se resuelven editando manualmente el archivo y confirmando los cambios

---

## 9. ¿Como funciona git add?

git add envía los archivos modificados al área de staging. Si se omite este paso, los cambios no se incluirán en el commit

---

## 10. ¿Qué es gitignore?

Es un archivo que indica qué archivos no deben ser rastreados por Git como archivos temporales o compilados.

---

## 11. Diferencia entre commit normal y commit --amend

- Commit normal crea un nuevo registro.

- Commit --amend modifica el último commit realizado.

---

## 12. ¿Quee es git stash?

Permite guardar cambios temporales sin hacer commit para poder cambiar de rama sin perder el trabajo actual.

---

## 13. ¿Como deshacer cambios en Git?

- git reset: mueve el puntero a un commit anterior.

- git revert: crea un nuevo commit que deshace uno anterior.

- git checkout: cambia de rama o recupera archivos.

---

## 14. ¿Como funcionan los remotos?

Origin es el repositorio principal remoto, Upstream es el repositorio original en caso de un fork.

---

## 15. ¿Como inspeccionar historial

- git log

- git diff

- git show

---
