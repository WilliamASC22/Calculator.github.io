// This function clears all the values
function clearScreen() {
    document.getElementById("calculatorResult").value = "";
}
 
// This function displays the values
function display(value) {
    document.getElementById("calculatorResult").value += value;
}
 
// This function evaluates the expression and returns the calculatorResult
		

function calculate() {
    var valu = document.getElementById("calculatorResult").value;
    var val = eval(valu);
    document.getElementById("calculatorResult").value = val;
}

function enterKeyPressed(event) {
    if (event.key === 'Enter') {
        calculate();
        return false;
    }
    return true;
}