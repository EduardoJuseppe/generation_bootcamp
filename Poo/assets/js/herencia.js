class Pokemon{
    //
    #nombre='';
    #edad=0;
    #evolucion='';
    // #tipo=''; ,tipo

    constructor(nombre,edad,evolucion){
        this.#nombre=nombre;
        this.#edad=edad;
        this.#evolucion=evolucion;
        // this.#tipo=tipo;
    }

    get nombre(){
        return this.#nombre;
    }

    atacar(){
        return console.log(`${this.#nombre} esta atacando`);
    }

    evolucionar(){
        // aqui se conoce como cortocircuito ||
        // false => tomara el valor de la izquierda
        // true => va a tomar el valor de la derecha
        const EVOLUCION = this.#evolucion ;
        let mensaje = '';

        console.log(EVOLUCION);
        if(EVOLUCION === ''){      
            mensaje = 'No puedo evolucionar';
        }else{
            // this.#nombre = this.#evolucion;  
            mensaje = `${this.#nombre} ha evolucionado a ${this.#evolucion}`
            this.#nombre = this.#evolucion;
        }
        return console.log(mensaje);
    }
}

const pokemon1 = new Pokemon('Charmander','2','charmeleon','Fuego');
const pokemon2 = new Pokemon('Pikachu','1','Raichu','Elektrico');


// console.log(pokemon1);
// console.log(pokemon2);

// pokemon1.atacar();
// pokemon2.atacar();

// pokemon1.evolucionar();
// console.log(pokemon1);

class TipoFuego extends Pokemon{
    #tipo='';
    constructor(nombre,edad,evolucion,tipo){
        super(nombre,edad,evolucion);
        this.#tipo = tipo;
    }
    atacar(){
        return console.log(`${super.nombre} esta lanzando un ataque de tipo ${this.#tipo}`);
    }
}

const charmander = new TipoFuego('Charmander','2','charmeleon','Fuego');
console.log(charmander);

charmander.atacar();

