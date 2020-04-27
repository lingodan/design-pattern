# 设计模式
https://www.cnblogs.com/WindSun/p/10223126.html

设计模式一套被反复使用、经过分类编目的代码设计经验总结。使用设计模式是为了复用成功的设计和体系结构、复用相似问题的相同解决方案，保证代码可靠性，使代码具有工程化的能力，能够更好的适应需求的变化。

## 1.创建型
单独对对象的创建进行研究，从而可以高效的创建对象。
## 2.结构型
研究对象的组成以及对象之间的依赖关系，如何设计对象的结构、继承和依赖关系会影响到后续程序的维护性、代码健壮性、耦合性等。
### 2.1 桥接模式（Bridge）
实现抽象类与实现类的脱耦，在两个独立变化的维度，改变其中一个具体实现，不会影响到用户的使用。
#### 优点
* 分离抽象接口及其实现部分，提高了比继承更好的解决方案。
* 提升了系统的可扩展性，在两个变化的维度任意扩展一个维度，都不需要修改原有系统
* 实现对于客户来讲是透明的，隐藏实现细节。
#### 缺点
* 增加系统的理解和设计难度，由于聚合关系建立在抽象层，要求开发者针对抽象进行设计与编程
* 桥接模式要求正确识别出两个独立变化的维度，因此其使用范围有一定的局限性。
#### 使用场景
* 增加抽象化角色和具体化角色之间组合的灵活性，避免在两个层次之间建立静态的继承关系，通过桥接模式可以使它们在抽象层建立一个关联关系。
* 对于那些不希望使用继承或者因为多继承导致系统类的个数急剧增加的系统
* 一个类存在两个独立变化的维度，且这个维度需要进行扩展。

----------------------
### 2.2 装饰器模式（Decorator）
允许向一个现有的对象添加新的功能，但同时又不改变其结构。创建一个装饰类，用来包装原有类，并保证原有方法签名的前提下，提供额外的功能。
#### 参考文档
https://www.cnblogs.com/volcano-liu/p/10897897.html
#### 典型应用
具体应用为Java I/O
#### 疑问
装饰器模式是继承关系的一个替代方案。我们看装饰类Decorator，不管装饰多少层，返回的对象还是Component(因为Decorator本身就是继承自Component的)，实现的还是is-a的关系。
装饰器模式与继承之间类似。
https://blog.csdn.net/qq_35551089/article/details/101558508
## 3.行为型
对对象的行为进行研究
### 3.1 观察者模式