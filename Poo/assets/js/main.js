class Persona{
    // atributos
    #id = 0;
    static #contador = 0;
    #nombre='';
    #edad=0;
    #correo='';
    constructor(nombre,edad,correo){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#correo = correo;
        this.#id = ++Persona.#contador;
    }
    // setters & getters
    // set & get
    // fijar & obtener

    get getNombre(){
        return this.#nombre;
    }
    set setNombre(nombre){
        this.#nombre = nombre;
    }
    get getEdad(){
        return this.#edad;
    }
    set setEdad(edad){
        this.#edad = edad;
    }
    get getCorreo(){
        return this.#correo;
    }
    set setCorreo(correo){
        this.#correo = correo;
    }

    // metodos

    cambiarNombre(nombre){
        this.#nombre = nombre;
    }

    #saludar(){
        let mensaje = `Hola mi nombre es ${this.#nombre}`;
        return mensaje;
    }

    mostrarSaludo(){
        return this.#saludar();
    }

    static mostrarContador(){
        return Persona.#contador;
    }
}

const persona1 = new Persona('Pedro',30,'pedro@gmail.com');
const persona2 = new Persona('Juseppe',28,'juseppe@gmail.com');
const persona3 = new Persona('Martin',40,'martin@gmail.com')
// persona1.nombre = 'Eduardo'
// persona2.nombre = 'Julieta'

// persona1.setNombre = 'jose'

// persona1.setNombre = 'Pedro';
// persona1.setEdad= 30;
// persona1.setCorreo = 'pedro@gmail.com';

// persona2.setNombre = 'Juseppe';
// persona2.setEdad= 28;
// persona2.setCorreo = 'juseppe@gmail.com';


// console.log(persona1.getNombre);
// console.log(persona1.getEdad);
// console.log(persona1.getCorreo);

// console.log(persona2.getNombre);
// console.log(persona2.getEdad);
// console.log(persona2.getCorreo);

console.log(persona1);
console.log(persona2);
console.log(persona3);



console.log(persona1.mostrarSaludo());
console.log(persona2.mostrarSaludo());
console.log(persona3.mostrarSaludo());

// console.log(Persona.contador);

console.log(Persona.mostrarContador());


