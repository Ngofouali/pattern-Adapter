<h2>Design Pattern Adapter</h2>
<h3>Présentation du Pattern Adapter</h3>
Le <strong>pattern Adapter (Adaptateur en français)</strong> est un design pattern de conception structurel qui permet à des interfaces incompatibles de travailler ensemble. Il agit comme un pont entre deux interfaces différentes, les rendants compatibles sans modifier leur code source.
<h3>Problématique</h3>
Comment manipuler des structures hiérarchiques complexes où certains objets peuvent être des éléments simples (feuilles) tandis que d'autres sont des conteneurs (composites) contenant d'autres objets, tout en fournissant une interface commune pour les deux types ?<br/>

<h3>Solution</h3
Le pattern Composite propose :<br/>
<ul>
<li>Une interface commune (Component) pour tous les éléments de la structure</li>
<li>Des Leaf (feuilles) qui sont les éléments terminaux</li>
<li>Des Composite qui peuvent contenir d'autres Component (feuilles ou autres composites)</li>
</ul>

<h3>Structure</h3>
<img src="captures/structure.png">
<br/>

<h3>Exemple d'implémentation</h3>
Dans cet exemple d'implémentation, nous allons implémenter un système de fichiers (Fichiers et Dossiers).
<br/>
<ol>
<li>Interface Component (Composant)</li>
<br/>
<img src="captures/Component.png">
<br/>
<br/>
<li>Classe Leaf (Feuille) - Fichier</li>
<br/>
<img src="captures/File.png">
<br/>
<br/>
<li>Classe Composite - Dossier</li>
<br/>
<img src="captures/Directory.png">
<br/>
<br/>
<li>Classe (Main) de démonstration</li>
<br/>
<img src="captures/Main.png">
<br/>
<br/>
<li>Test Terminal</li>
<br/>
<img src="captures/Test1.png">
</ol>

<h3>Cas d'utilisation</h3>
<ul>
<li>Systèmes de fichiers (dossiers et fichiers)</li>
<li>Interfaces graphiques (conteneurs et widgets)</li>
<li>Menus hiérarchiques</li>
<li>Structures organisationnelles</li>
<li>Systèmes de documents (documents, sections, paragraphes)</li>
</ul>
<br/>

<h3>Conclusion</h3>
Ce pattern est particulièrement utile lorsqu'il faut implémenter une structure hiérarchique où chaque élément peut être traité de manière uniforme, qu'il s'agisse d'un objet simple ou d'un groupe d'objets.