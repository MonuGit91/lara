class Q{
    public static void main(String[] args){
        if(args.length < 1) {
            System.out.println("supply one command line argument");
            return;
        }
        int i = Integer.parseInt(args[0]);
        switch(i) {
            case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println("odd value");
				break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println("even value");
				break;

			default:
				System.out.println("supply any number b/w 1 to 10");
        }
        System.out.println("main end");
    }
}
