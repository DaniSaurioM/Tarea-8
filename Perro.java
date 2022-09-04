

//este perro extiende de la clase animal, es su hija.
public class Perro extends Animal{
    public Perro(String especie) {
    super(especie);

    }


    /*Aqui sobreescribimos el metodo que ya existe en la clase padre.
      Este es el metodo que se va a ejecutar si mandamos a llamar el metodo desde un objeto de la clase 'perro'
      Si no lo hicieramos, mostraria el metodo por default creado en la clase padre.
     */
    @Override
    public void caminoAnimal() {
        System.out.println("EL perro esta caminando");
    }

    @Override
    public void especieAnimal() {
        System.out.println("Mi raza es "+especie);

    }
    /*Aqui vamos a sobrecargar el metodo con otro metodo que se llame igual 'caminoAnimal
      Con la diferencia que le vamos a pasar un parametro.
     */

    public void caminoAnimal(String lugar){
        System.out.println("El perro esta caminando por "+lugar);

    }
}
