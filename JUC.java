    // JUC

    public class ThreadLocal<T> {

        static class ThreadLocalMap {

            // entry 是弱引用的  key=null说明entry可以被删除，这样的entry称为stale entries
            static class Entry extends WeakReference<ThreadLocal<?>> {
            }
        }

        /**
         * 存储thread local 对象，用线性探测的方法解决hash冲突
         */
        private void set(ThreadLocal<?> key, Object value)
    }

    public class AtomicInteger


    // AQS 及其应用
    public abstract class AbstractQueuedSynchronizer

        public class ReentrantLock
        public class Semaphore
        public class CountDownLatch


    public class ConcurrentHashMap<K,V> extends AbstractMap<K,V>{

        /**
         * 容量控制变量
         */
        private transient volatile int sizeCtl;

        /**
         * 节点容器
         */
        transient volatile Node<K,V>[] table;


        /**
         * 初始化tab数组，关键变量 sizeCtl  yield让出cpu + cas操作
         */
        private final Node<K,V>[] initTable()

        /**
         * 放入值   为空时尝试cas放入，不为空时，synchronized放入
         */
        putVal(K key, V value, boolean onlyIfAbsent)

        /**
         * 获取值
         */
        public V get(Object key)

    }

