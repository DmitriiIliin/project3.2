public class BmiService {

    /*Строка ниже - создаю метод(=функция=команда) "calculate" (ее придумали сами )
    с параметрами! (не c переменными) "weight" и "height" */
    //public int calculate(double weight, double height) {
    public double calculate(double weight, double height) {

        /* Далее пишу код функции (команды/метода) "calculate". Создаю локальную переменную "mybmi",
        что бы в нее складывались результаты для различных  значений параметров "weight" и "height".
        Они являются входными данными для ф-ции "calculate".*/
        double mybmi = weight / height / height;


        int bmi = (int) mybmi;
        //Ф-ция "calculate" возвращает вычисленное значение локальной переменной "mybmi"
        //return (int)mybmi; //это выходные данные, если целочисленное значение выводим тут
        return mybmi;    // и это выходные данные, если целочисленное значение выводим в Maine

    }

}