class Abc(
        val name: String,
        val ispassed : Boolean
)

fun main(args: Array<String>) {

    val abc = Abc("Bima",true)
    println(abc.name)
    println(abc.ispassed)

    /*
    In Java
    Abc abc = new Abc("Bima",true);
    System.out.println(person.getName());
    System.out.println(person.isMarried());

    */
}
