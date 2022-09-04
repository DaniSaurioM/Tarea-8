public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("leon");
        Perro perro=new Perro("doberman");

        System.out.println("metodos de la clase padre 'animal'");
        animal.especieAnimal();
        animal.caminoAnimal();
        System.out.println(" ");


        System.out.println("metodos sobreescritos de la clase hija 'perro' ");
        perro.especieAnimal();
        perro.caminoAnimal();
        System.out.println(" ");


        System.out.println("Metodo sobrecargado de la clase hija 'perro' que nos pide un parametro");
        perro.caminoAnimal("Parque");
    }
}