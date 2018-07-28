package com.example.cartman.faeronages.game;


import java.util.Random;

public class data {
    public static String[] hangOut=new String[]{"[放松]正在和自己尬舞","[放松]正在和左手打架","[警戒]正在机敏的巡视四周","[警戒]正在灌木丛中躲藏","[愉悦]正在生吃史莱姆"
            ,"[放松]正在生吃马卡龙","[警戒]正在担忧接下来的战斗","[修整]正在检查装备","[修整]正在检查武器","[警戒]正在消除自己的踪迹","[修整]正在给伤口消毒","[修整]正在给伤口包扎",
            "这武器a下去怎么有爆炸的声音","[放松]正在洗脸","[警戒]正在搜寻猎物"};

    public  String[] monsterDescription=new String[]{"仁慈的","痛苦的","绝望的","巨大的","营养不良的","狂暴的","娇小的",
            "聪慧的","发育中的","巨无霸","发情的","正义的","凶恶的","垂暮的","垂死的","暗影的","残缺的","善良的",
            "温和的","被诅咒的","经验丰富的","幼稚的","成群的","混乱的"};
    public static String[] beginnersGuide=new String[]{"小野猪 猪肉","小白兔 兔毛","史莱姆 凝胶","野狗 狗牙","小黑兔 黑兔毛",
            "田鼠 鼠皮","食人花 食人花的蕊","小野猪 野猪皮","小豹子 豹子皮","小蝙蝠 蝙蝠翅膀","小松鼠"};
    public static String[] fungalWastes=new String[]{"腐败者 腐肉","真菌喷射者 剧毒菌丝",
            "沼泽巨人 鳞斑苔藓","蘑菇人 蘑菇","被寄生者 寄生菌丝","人形菌丝堆 剧毒菌丝","腐肉撕咬 钩刃触须","腐肉舔舐者 强腐液体","腐败之形 腐败原体"};
    public static String[] restingYards=new String[]{"活尸 干瘪肢体","食尸鬼 感染血液"
            ,"游荡鬼魂 弃尸灵魂碎片","骷髅 骸骨","食腐野狗 带病狗牙","守墓人 布衣残片","伪形者 弃尸灵魂残片","游荡恶魂 弃尸灵魂残片","盗墓人 遗物","拼接巨尸 破碎肢体","腐肉堆积者","瘟疫散播者 感染腐肉","瘟疫活尸 感染腐肉"};
    public static String[] limbo=new String[]{"罪人 被折磨的灵魂","屠夫","镰刃行刑官 被折磨的灵魂",
            "监牢守卫","恸哭之人 尖叫碎片","哀嚎者 悔恨","伪善者 谎言","鞭笞者 破碎的灵魂","深渊恶魔 恶之华","碎魂恶鬼","原罪学者 黑暗之环"};
    public static String[] mechanus=new String[]{"故障机器人 螺丝","机械飞蛾 螺丝","粉碎者 零件"
            ,"TC130 电路板","发条人 电路板","巨锤碾压者 电路板","机械幽浮 电路板","守门人 零件","自爆机器人","机械蜘蛛 损坏的芯片","钢铁锻造者 损坏的芯片","破损的统治者 核心组件"};
    public static String[] shore=new String[]{"发狂的渔夫 麻布","海盗掠夺者 钩刃","海盗屠戮者 弯刀"
            ,"海盗参谋 珠宝","鱼人守卫 鱼鳍","海洋嗜血者 鱼骨","深海掠夺者 鱼人骨","深海巨口 巨型骸骨","鲸鲨骑手 海洋守护","深海恐惧 潮汐使者"};
    public static String[] slum=new String[]{"盗贼 珠宝","小偷 遗失的钱包","强盗 赃物"
            ,"土匪 赃物","土匪参谋 珠宝","土匪头子 赏金","剧毒蜥蜴 毒腺","死亡沙虫 厚质鳞片"};
    public static String[] barrenPlain=new String[]{"瘟疫传播者 腐臭残肢","淡水鳄 鳄鱼皮","狼 狼皮"
            ,"滩羊 羊皮","狮鹫 厚重羽毛","毒蛇 毒腺","野狗 狗牙","小豹子 豹子皮","成年雄狮 狮皮","田鼠 鼠皮","被诅咒的稻草人 诅咒印记"};
    public static String home="may be it's time to go home";



    //数字越大→true
    public static boolean d20(int number){
        Random random=new Random();
        return number>=(random.nextInt(20)+1);
    }
}