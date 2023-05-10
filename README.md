I.
Autotests developed with Selenide for sites:
1. https://github.com/selenide/selenide
2. https://the-internet.herokuapp.com/drag_and_drop

Used methods:
1. click
2. shouldBe
3. shouldHave
4. dragAndDrop

Tried condition "visible".

II.
Answer on the first question is "No".
$("h1 div") would look for the first appropriate "h1", containing "div". In the example forward "beta" would be found.  
$("h1").$("div") would look for the first "h1" and "div" inside. In the example forward nothing would be found
<div>
  <h1>
    <a>
      alpha
    </a>
  </h1>
  <h1>
    <div>
      beta
    </div>
  </h1>
</div>
