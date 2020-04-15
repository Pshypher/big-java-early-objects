/**
        The Date class tells the fortunes for programmers of various astrological
        signs
*/
public class Date
{
        private int month;
        private int date;
        
        /**
                Constructor for an instance of the Date class 
                @param aMonth month of the certain year
                @param birthdate date of birth of programmer   
        */
        public Date(int aMonth, int birthdate)
        {
                month = aMonth;
                date = birthdate;
        }
        
        /**
                Checks that the birthdate of the programmer is valid
                @return true for valid dates
        */
        public boolean isValid()
        {
                if (month < Month.JANUARY || month > Month.DECEMBER)
                {
                        return false;
                }
                else 
                {
                        Month monthObj = new Month(month);
                        if (date < 1 || date > monthObj.getLength())
                        {
                                return false;
                        }
                        return true;
                }
        }
        
        /**
                The fortune of a programmer belonging to a certain astrological 
                sign is returned
                @return the horoscope of the user
        */
        public String getAstrologicalSign()
        {
                String astrologicalSign;
                switch (month)
                {
                        case Month.JANUARY:
                                if (date < 20)
                                        astrologicalSign = "Capricorn";
                                else
                                        astrologicalSign = "Aquarius";
                                break;                                       
                        case Month.FEBRUARY:
                                if (date < 19)
                                        astrologicalSign = "Aquarius";
                                else
                                        astrologicalSign = "Pisces";
                                break;                                        
                        case Month.MARCH:
                                if (date < 21)
                                        astrologicalSign = "Pisces";
                                else
                                        astrologicalSign = "Aries";
                                break;                                        
                        case Month.APRIL:
                                if (date < 20)
                                        astrologicalSign = "Aries";
                                else
                                        astrologicalSign = "Taurus";
                                break;                                        
                        case Month.MAY:
                                if (date < 21)
                                        astrologicalSign = "Taurus";
                                else
                                        astrologicalSign = "Gemini";
                                break;
                        case Month.JUNE:
                                if (date < 22)
                                        astrologicalSign = "Gemini";
                                else
                                        astrologicalSign = "Cancer";
                                break;
                        case Month.JULY:
                                if (date < 23)
                                        astrologicalSign = "Cancer";
                                else
                                        astrologicalSign = "Leo";
                                break;
                        case Month.AUGUST:
                                if (date < 23)
                                        astrologicalSign = "Leo";
                                else
                                        astrologicalSign = "Virgo";
                                break;                                        
                        case Month.SEPTEMBER:
                                if (date < 23)
                                        astrologicalSign = "Virgo";
                                else
                                        astrologicalSign = "Libra";
                                break;
                        case Month.OCTOBER:
                                if (date < 24)
                                        astrologicalSign = "Libra";
                                else
                                        astrologicalSign = "Scorpio";
                                break;
                        case Month.NOVEMBER:
                                if (date < 22)
                                        astrologicalSign = "Scorpio";
                                else
                                        astrologicalSign = "Sagittarius";
                                break;
                        default:
                                if (date < 22)
                                        astrologicalSign = "Sagittarius";
                                else
                                        astrologicalSign = "Capricorn";
                                                                                                                                                                                                                                                                                                                                                                                                                                       
                }
                return astrologicalSign;
        }
        
         /**
                The fortune of a programmer belonging to a certain astrological 
                sign is returned
                @return the horoscope of the user
        */
        public String getFortune()
        {
                String zodiacSign = getAstrologicalSign();
                
                String fortune;
                if (zodiacSign.equals("Aries"))
                        fortune = "avoid committing yourself to the next project at work." +
                                " It's going to become a death march, and you know it." +
                                " Save your skills and energy for some open source hacking";
                else if (zodiacSign.equals("Taurus"))
                        fortune = "you've been flirting with functional programming and now "
                                + "it's time to take the plunge. Free your soul of " +
                                "side-effects and embrace a monad. It will make you feel good.";
                else if (zodiacSign.equals("Gemini"))
                        fortune = "you are entering a period of introspection. For pair programming,"
                                + " it's best to hook up with Cancer. Avoid Pisces, because you know"
                                + " you'll bicker over inheritance versus composition until someone "
                                + "gets hurt by a fast-moving keyboard.";
                else if (zodiacSign.equals("Cancer"))
                        fortune = "your creative juices are flowing. Color coordinated themes will " +
                                "jump from your mind to fill the soft, supple curves of the rounded" +
                                " rectangles your customers visually crave. Who said developers " +
                                "can't design a UI? Not you!";
                else if (zodiacSign.equals("Leo"))
                        fortune =  "you might start feeling detached from the rest of the team. Now" +
                                " is the time to randomly refactor code that someone else wrote in" +
                                " the name of collective code ownership. You might spark a new relationship!";
                else if (zodiacSign.equals("Virgo"))
                        fortune = " you might need to apply some fundamental design patterns to find the" + 
                                " elegant solution you seek. Repository. Abstract Factory. Visitor. Pick 2.";
                else if (zodiacSign.equals("Libra"))
                        fortune = "there are lots of meetings in your future. Some of those future meetings "
                                + "will be meeting to discuss future meetings (the meta-meeting meeting). "
                                + "Good for you the gaming market for cell phones is hitting its stride.";
                else if (zodiacSign.equals("Scorpio"))
                        fortune = "don't get frustrated with what your future holds. Broken builds, failing"
                                + " tests, and bug reports like \"I think it broke when I click Submit, or"
                                + " something\". Be positive and live stress free. Consider taking up Yoga.";
                else if (zodiacSign.equals("Sagittarius"))
                        fortune = "you should start taking security seriously. SQL injections, code " +
                                "injections, script injections, header injections. Everyone is out to get you,"
                                + " and it's only a matter of time. Only the paranoid survive. If you can trust a"
                                + " Scorpio, you might find a mentor.";
                else if (zodiacSign.equals("Capricorn"))
                        fortune = "time for a change. If you've been using a statically typed language, then try"
                                + " something dynamic. If you've been using a dynamic language, then try " +
                                "something static. If you do both, then try Malbolge.";
                else if (zodiacSign.equals("Aquarius"))
                        fortune = "to you, software is a craft. You always have your eye on an impossible star," +
                                " but you reach anyway. The vague predictions of horoscopes drive you crazy, but"
                                + " no one ever accused them of being a science, eh? Pisces will be your friend.";
                else
                        fortune = " monkeys with keyboards – that's what you may be thinking about your team when "
                                + "the next project starts. When life gives you monkeys – make bananas. Or " +
                                "something like that. Watch out for Sagittarius.";
                                
                return fortune;                                                                                                                                                                                                                                                                                                                   
        }
}                        