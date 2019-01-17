实现布告板展示数据的功能。现在一共有三个布告板，数据的来源是一个data实体类，data
实体类中有temperate,weather,wind,rain,date,averageTemperate,could.
布告板A中显示temperate,weather，wind
布告板B中显示temperate,averageTemperate,date,
布告板C中显示wind,rain,could,date
布告板中需要及时更新来自data实体类中的信息

观察者模式：定义了对象之间的一对多依赖，这样一来，当一个对象改变状态的时候，他的所有
依赖者都会收到通知并自动更新