/* Днмонстрация использования переменных
Присвоиваем файлу с исходным кодом имя Example2.java
 */
public class Example2 {
public static void main(String args []){
    int var1;  // объявляемая переменная
    int var2; //обьявляем еще одну переменную

    var1 = 1024; // переменной присваиваем значение 1024
    System.out.println("Переменная var1 содержит " + var1);

    var2 = var1/2;
    System.out.print("Переменная var2 содержит var1/2:");
    System.out.println(var2);
   }
}
