入门
实现一个带有特色功能的鸭子，鸭子可以飞行，可以划水，可以发出叫声
    现在有三个方案
    1.写一个鸭子的超类，将飞行，划水，发声的方法放到超类中，由子类继承并重写上述方法
    2.写一个鸭子的超类，写三个行为的接口，飞行接口，划水接口，发声接口，子类继承鸭子
      超类，根据业务需求，不同的子类实现不同的接口
    3.写一个鸭子的超类，写三个行为的接口，飞行接口，划水接口，发声接口，超类中定义三
      个行为的属性，方法。子类实例化的时候将行为实现类传过去
    分析：1.中的方法存在继承问题，例如某些不需要飞行方法的子类也具有飞行方法（即使你
         重写之后让他什么都不做）
         2.中的方法存在修改问题，例如现在有50个类（夸张）都重写了飞行接口中的方法
         fly，有一天我将fly修改成fly2，那么我就需要挨个去50个类中修改，显然，这个
         方法会让你爆炸
         
    
      
    
