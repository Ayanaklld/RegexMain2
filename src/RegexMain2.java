import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain2 {
    public static void main(String[] args) {
        // `Pattern` - класс объекты которого хранят информацию о регулярном
        // выражении и предоставляют методы для его дальнейшего использования.

        // `Pattern.compile(String regex) : Pattern` - возвращает объект класса
        // Pattern созданный на основе регулярного выражения заданного через
        // параметры.

        // `pattern.matcher(String text) : Matcher` - возвращает объект Matcher
        // созданный для строки переданной через параметры с регулярным
        // выражением исходного объект Pattern.

        // `Matcher` - класс объекты которого позволяют произвести поиск
        // совпадений в заданной строке по заданному регулярному выражению.

        // `matcher.find() : boolean` - производит поиск очередного совпадения
        // в строке по заданному шаблону. Возвращает true если найдёт
        // совпадение и false если не найдёт.

        // `matcher.matches() : boolean` - производит сопоставление цельной
        // строки (применяются правила ^ и $ даже если их явно не записывать) с
        // заданным шаблоном. Возвращает true если строка соответствует шаблону
        // и false если не соответствует.

        // `matcher.start() : int` - возвращает начальную позицию совпадения на
        // котором в момент вызова находится объект Matcher.

        // `matcher.end() : int` - возвращает конечную позицию совпадения на
        // котором в момент вызова находится объект Matcher.

        // `matcher.group(int group) : String` - возвращает значение указанной
        // группы регулярного выражения. Группа представляет собой часть
        // регулярного выражения взятую в круглые скобки, каждая группа имеет
        // свой порядковый номер начиная с единицы. По умолчанию в любом
        // шаблоне присутствует группа с номером 0, она хранит цельное
        // совпадение с шаблоном.

        /*
        String text = "hello 17 liquid 789 56 world 2";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            // System.out.println(matcher.start() + " - " + matcher.end());
            // System.out.println(text.substring(matcher.start(), matcher.end()));
            System.out.println(matcher.group());
        }
        */

        String code = "Z547833CN";
        Pattern pattern = Pattern.compile("Z(\\d{6})([A-Z]{2})");
        Matcher matcher = pattern.matcher(code);
        if (matcher.matches()) {
            System.out.printf("Full code: %s\n", matcher.group());
            System.out.printf("Only digits: %s\n", matcher.group(1));
            System.out.printf("Country code: %s\n", matcher.group(2));
        } else {
            System.out.println("Wrong code");
        }


    }
}
