

package geekbrains.homework1.homework5;

//        * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//        * Конструктор класса должен заполнять эти поля при создании объекта;
//        * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//        * Создать массив из 5 сотрудников
public class Aplication {


        public static void main(String[] args) {
            // Вначале объявляем массив объектов

            Person[] persArray = new Person[5];
            // потом для каждой ячейки массива задаем объект
            persArray[0] = new Person("Ivanov Ivan",  "Engineer","ivivan@mailbox.com",  "892312312", 30000, 30);
            persArray[1] = new Person("Sokolov Sergey","Driver", "sergey@mailbox.com", "1892312312", 40000, 40);
            persArray[2] = new Person("Smirnov Andry", "Worker", "andry@mailbox.com", "2892312312", 50000, 50);
            persArray[3] = new Person("Ivkov Aleksei", "Programmist","aleksei3@mailbox.com", "3892312312", 60000, 60);
            persArray[4] = new Person("Petrov Aleksandr","Teacher", "aleks4@mailbox.com", "4892312312", 70000, 70);



            for(Person item : persArray) {
                if(item.getAge() > 40) {
                    item.getPersonInfo();
                }
            }
        }







}
