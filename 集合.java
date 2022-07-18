public class 集合 {
    public class ArrayList<E> extends AbstractList<E>{

        /**
         * 存放元素的数组
         */
        transient Object[] elementData;

        /**
         * 保证容量，可以在大批量添加前使用，一次性扩容
         */
        public void ensureCapacity(int minCapacity);
        /**
         * 添加元素
         */
        public boolean add(E e);

    }


    public class HashMap<K,V> extends AbstractMap<K,V>{

        final V putVal(int hash,

    }


}
