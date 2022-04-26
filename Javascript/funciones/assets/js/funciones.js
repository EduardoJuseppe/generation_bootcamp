
// function saludar(nombre='panchito',apellido='Perez'){
//     let nombre = true;
//     console.log('Hola mi nombre es ',nombre,apellido);
//     console.log(`Hola mi nombre es: ${nombre?"Juseppe":"Desconocido"}`);
//     return `Mi nombre es ${nombre} ${apellido}`
// }

// let funcionSaludar = saludar("Eduardo","Juseppe");
// console.log(typeof(funcionSaludar));
// console.log(funcionSaludar);

// document.write(`<h1>Este es un h1</h1>`);
// console.log(`<h1>Este es un h1</h1>`);

// funcion declarada

// function suma(a,b){
//     return a+b;
// }

// console.log(suma(10,20));

// // funciones expresadas o funcion expresion

// const resta = function(a,b){
//     return a - b;
// }
// console.log(resta(30,10));

// // let valor=0;
// // valor=resta(10,20)
// setTimeout(()=>{

// },3000);

// // funcion flecha

// const multiplicacion =(a,b)=>{
//     return a*b;
// }

// console.log(multiplicacion(suma(10,20),resta(10,20)));

let nombre = " "

const invertirCadena =(nombre)=>{

    if(nombre.length<1){
        console.warn("No se ingreso texto");
    }
    else{
        let cadenaInvertida="";
        // console.log(nombre);
        for(let x=(nombre.length)-1;x>=0;x--){
            // console.log(x);
            auxiliar=nombre.charAt(x); 
            // console.log(auxiliar);
            cadenaInvertida=cadenaInvertida.concat(auxiliar);
            // console.log(cadenaInvertida)    
        }
    return cadenaInvertida;
    }

    
}
console.log(nombre);
let invertida =invertirCadena(nombre);
console.log(invertida);