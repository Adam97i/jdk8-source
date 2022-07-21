
## 阅读步骤
- 选中部分代码全局搜索即可找到对应源码


## 快捷键
| 方法名                         | 说明     | 快捷键              | 推荐增加    |
|-----------------------------|--------|------------------|---------|
| Go to Declaration or Usages | 进入代码调用 | Ctrl + B         | Alt + E |
| Back                        | 返回调用   | Ctrl + Alt + ←   | Alt + Q |  
| Find in files               | 全局搜索   | Ctrl + Shift + F | Alt + W | 





## 集合



```java
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
```

## JUC

```java

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

```

## JVM

```java
    // 类加载器
    protected Class<?> loadClass(String name, boolean resolve)
    /**
     * 自定义类加载器
     *      打破双亲委派机制，  重写loadClass方法
     *      不打破双亲委派机制，重写findClass方法
     */
        
```



