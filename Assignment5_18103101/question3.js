  function question3(){

string = prompt("Enter the Brackets")
string = string.replace(/\s+/g, '');
var len = string.length;

class Stack{
    constructor()
    {
        this.items =[];
    }
    push(element){
        this.items.push(element);
    }
    pop(){
        if(this.items.length==0){
            return "Underflow";
        }
        return this.items.pop();
    }
}

var stack = new Stack();
var comp = 0;
if (len%2==0){
    for(var i=0; i<len;i++){
        if(string[0]=="}"||string[0]=="]"||string[0]==")")
        {
                   document.getElementById("message").innerHTML="false";
                    comp=1;
                    break;

        }
        else if(string[len-1]=="{"||string[len-1]=="["||string[len-1]=="(")
        {
                   document.getElementById("message").innerHTML="false";
                    comp=1;
                    break;

        }
        else if(string[i]=='{' || string[i]=="[" || string[i]=="(")
        {
          stack.push(string[i]);
        }

        else if(string[i]=='}' || string[i]==']' || string[i] == ')')
        {
            var a = stack.pop();
            console.log(a);
            if(a=="{"){
                if(string[i]=="}"){
                    document.getElementById("message").innerHTML="Processing...";
                }
                else{
                    document.getElementById("message").innerHTML="false";
                    comp=1;
                    break;
                }
            }
          else if(a=="["){
               if(string[i]=="]"){
                document.getElementById("message").innerHTML="Processing...";
                }
                else{
                    document.getElementById("message").innerHTML="false";
                    comp=1;
                    break;
                }
          }
          else if(a=="("){
               if(string[i]==")"){
                document.getElementById("message").innerHTML="Processing...";
                }
                else{
                    document.getElementById("message").innerHTML="false";
                    comp=1;
                    break;
                }
          }
          
        }
                  else{
                    document.getElementById("message").innerHTML="false";
                    comp=1;
                    break;

        }
    }
    if(comp==0){
        document.getElementById("message").innerHTML="true";
    }
    
}


else{
    document.getElementById("message").innerHTML="false";
}
}
