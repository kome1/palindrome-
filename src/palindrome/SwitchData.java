
public class SwitchData {
    
    public int month =9;
    public voice calculatedNumDays(){
        Switch(month){
        case1:case3:case5:case7:case8:case10:case12:
        System.out.println("There are 31 daysjn that month");
        break;
        case2:
        System.out.println("There are 28 days int that month");
        break;
        default:
        System.out.println("invalid month");
        break;
    }
}

    private void Switch(int month) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        
        
    }
    }
    
}
