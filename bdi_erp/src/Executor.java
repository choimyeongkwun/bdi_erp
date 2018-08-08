
interface Action{
	
}
class Father implements Action{
	
}

class Son extends Father{
	
}
public class Executor {
	Object f = new Son();
}
