// JavaScript Document
function addButton(parent,btnLabel,className,clickEvent){
	var oButton = document.createElement("div");
	oButton.className = className;
	oButton.innerText = btnLabel;
	oButton.onclick = clickEvent;
	parent.appendChild(oButton);
}

function remove(parent){
	var child = parent.children;
	if (child){
		var size = child.length;
		parent.removeChild(child[0]);
	}
}

function jsAddButton(label,toast){
    var clickEvent;
    if (toast == true){
        clickEvent = function(){
            window.android.toast("Hello JavaScript");
        }
    }else{
       clickEvent = function(){
          window.android.startCapture();
       }
    }
    var oMain = document.getElementById("main");
    addButton(oMain,label,"btn",clickEvent);
}

function jsRemoveButton(){
    var oMain = document.getElementById("main");
    remove(oMain);
}

function jsGetDate(){
    var date =  new Date().toString();
    return date;
}