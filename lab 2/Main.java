// Главный класс
public class Main {

    public static void main(String[] args) {

        // ===== Задача 1. Переменные и константы =====
        System.out.println("Задача 1. Переменные и константы");

        int count = 10;              // целочисленная переменная
        double price = 99.99;        // вещественная переменная
        boolean isActive = true;     // логическая переменная
        final int MAX_VALUE = 100;   // константа

        System.out.println("Количество: " + count);
        System.out.println("Цена: " + price);
        System.out.println("Активен: " + isActive);
        System.out.println("Максимальное значение (константа): " + MAX_VALUE);

        System.out.println();

        // ===== Задача 2. Примитивные и ссылочные типы =====
        System.out.println("Задача 2. Примитивные и ссылочные типы");

        int number = 5;              // примитивный тип
        String text = "Привет";      // ссылочный тип

        // int хранит само значение
        // String хранит ссылку на объект в памяти
        System.out.println("Число (int): " + number);
        System.out.println("Строка (String): " + text);

        System.out.println();

        // ===== Задача 3. Область видимости переменных =====
        System.out.println("Задача 3. Область видимости переменных");

        ScopeExample example = new ScopeExample();
        example.showVariables();

        System.out.println();

        // ===== Задачи 4 и 5. Наследование и переопределение методов =====
        System.out.println("Задачи 4 и 5. Наследование и полиморфизм");

        // Ссылка базового класса указывает на объект производного класса
        Person person = new Student("Иван", 20, "ИС-2204");

        // Вызов переопределённого метода (полиморфизм)
        person.displayInfo();
    }
}

// ===== Задача 3. Класс для области видимости =====
class ScopeExample {
    int classVariable = 50; // поле класса (доступно во всех методах)

    void showVariables() {
        int localVariable = 20; // локальная переменная (доступна только в методе)

        System.out.println("Поле класса: " + classVariable);
        System.out.println("Локальная переменная: " + localVariable);
    }
}

// ===== Задача 4. Базовый класс =====
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

// ===== Задача 4 и 5. Производный класс =====
class Student extends Person {
    String group;

    Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    // Переопределение метода
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}
