package homeWork4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод добавляет данные во внутреннее поле data и возвращает номер позиции
     * в которую были вставлены данные, начиная с 0
     *
     * @param item эллемент для хранения
     * @return возврощает индекс вставленного эллемента. Возврощает -1 если элемент вставлять нельзя; 0 и более, если
     * эллемент вставлен
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }
        this.data = Arrays.copyOf(this.data, this.data.length + 1);
        this.data[this.data.length - 1] = item;
        return this.data.length - 1;
    }

    /**
     * Метод возвращает индекс эллемента
     *
     * @param index индекс эллемента
     * @return возврощает индекс искомого эллемента или null, если индекс не найден
     */
    public T get(int index) {
        if (index < 0 || index >= this.data.length) {
            return null;
        }
        return this.data[index];
    }

    /**
     * Метод для получения содержимого массива
     *
     * @return возвращает поле data
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * Метод удаляет элемент из  поля data по индексу
     *
     * @param index индекс эллемента
     * @return true если удалили, false если такого индекса нет
     */
    public boolean delete(int index) {
        if (index < 0 || index >= this.data.length) {
            return false;
        }
        for (int i = index + 1; i < this.data.length; i++) {
            this.data[i - 1] = this.data[i];
        }
        this.data = Arrays.copyOf(this.data, this.data.length - 1);
        return true;
    }

    /**
     * Метод удаляет элемент из  поля data
     *
     * @param item элемент
     * @return true если удалили, false если такого элемента нет
     */
    public boolean delete(T item) {
        for (int i = 0; i < this.data.length; i++) {
            if (Objects.equals(this.data[i], item)) {
                for (int j = 1; j < this.data.length; j++) {
                    this.data[j - 1] = this.data[j];
                }
                this.data = Arrays.copyOf(this.data, this.data.length - 1);
                return true;
            }
        }
        return false;
    }

    /**
     * Метод сортирует данные, используя реализация сравнения из переданного объекта Comparator
     *
     * @param comparator для сравнения эллементов
     */
    public void sort(Comparator<T>comparator) {
        for (int i = 0; i < this.data.length - 1; i++) {
            for (int j = 0; j < this.data.length - 1; j++) {
                if (comparator.compare(this.data[j], this.data[j + 1]) > 0) ;
                T temp = this.data[j];
                this.data[j] = this.data[j + 1];
                this.data[j + 1] = temp;
            }
        }
    }

    /**
     * Переопределенный метод toString()
     *
     * @return выводить содержимое без ячеек в которых хранится null
     */
    @Override
    public String toString() {
        return Arrays.toString(data).replaceAll(", null", "").
                replaceAll("null, ", "");
    }

    /**
     * сортирует элементы в переданном объекте DataContainer используя реализацию
     * сравнения вызываемый у хранимых объектов
     *
     * @param dataContainer объект DataContainer
     * @param <T>           дженерик
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer) {
        for (int i = 0; i < dataContainer.data.length - 1; i++) {
            for (int j = 0; j < dataContainer.data.length - 1; j++) {
                if (dataContainer.data[j].compareTo(dataContainer.data[j + 1]) > 0) ;
                T temp = dataContainer.data[j];
                dataContainer.data[j] = dataContainer.data[j + 1];
                dataContainer.data[j + 1] = temp;
            }
        }
    }

    /**
     * сортирует элементы в переданном объекте DataContainer используя реализацию сравнения из переданного
     * объекта интерфейса Comparator
     *
     * @param dataContainer
     * @param comparator    для сравнения эллементов
     * @param <T> дженерик
     */
    public static <T> void sort(DataContainer<T> dataContainer, Comparator<T> comparator) {
        for (int i = 0; i < dataContainer.data.length - 1; i++) {
            for (int j = 0; j < dataContainer.data.length - 1; j++) {
                if (comparator.compare(dataContainer.data[j], dataContainer.data[j + 1]) > 0) ;
                T temp = dataContainer.data[j];
                dataContainer.data[j] = dataContainer.data[j + 1];
                dataContainer.data[j + 1] = temp;
            }
        }
    }
}