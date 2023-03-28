public class Book {                            // Класс для создания шаблона под книгу, на его основе будем создавать книги
    // Поля класса - т.е. атрибуты книг
    String description;                        // Описание книги
    private String title;                      // Название
    String author;                             // Автор
    String genre;                              // Жанр
    int quantity;                              // Количество страниц

    /*
    Поля класса декларированы, но не инициализированы, т.е. объявлены переменные, но они еще не имеют значений.
    Для создания конкретной книги, нужно инициализировать переменные, т.е. присвоить значение.
    В классе для выполнения такое задачи существуют специальные методы - конструкторы
    Конструктор всегда пишется с большой буквы, не имеет типа метода и совпадает с названием класса, в котором он определен,
    например:
    В текущем классе все конструкторы будут иметь название - Book();
    this - ссылка на текущий экземпляр объекта - по факту в конструкторе строчка :
     this.description = description;
     означает присвоить поля description(глобальной переменной), значение параметра конструктора description(локальной
     переменной)
     */

    public Book(String description, String title, String author, String genre, int quantity){ // Конструктор
        // Присваиваем глобальным переменным(полям класса) локальные значения(параметры конструктора) с таким же названием
        // при помощи слова this
           this.description = description;
           this.title = title;
           this.author = author;
           this.genre = genre;
           this.quantity = quantity;
    }

    /*
    Метод out - выводит на консоль все переменные объекты
     */

   public void out(){
      System.out.println("description: " + description + "\n"                 // \n - переход на новую строку
                           +"title: " + title + "\n" +                        // Вывод параметры объекта, каждый с новой строки
                            "author: " + author +"\n"+
                             "genre: " + genre + "\n" +
                             "quantity: " + quantity  );
   }



}
