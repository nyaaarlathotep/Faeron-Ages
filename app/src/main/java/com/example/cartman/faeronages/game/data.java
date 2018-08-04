package com.example.cartman.faeronages.game;


import java.util.Random;

public class data {

    public static int d20=0;
    public static boolean d20haveShown=true;
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

    public static String burd0="舞光术（Dancing Lights）:制造火把或其他光源。 晕眩术（Daze）:4HD 以下的人形生物会失去下一次的动作。侦测魔法（Detect Magic）:"+
            "侦测 60 尺内的法术或魔法物品。闪光术（Flare）:使一个生物目眩（攻击检定-1）。幻音术（Ghost Sound）:发出虚幻的假声。指北术（Know Direction）:指" +
            "出北方。光亮术（Light）:使目标物品如火把般发光。瞌睡术（Lullaby）:使受术者昏昏欲睡，「侦察」与「聆听」检定受到-5 减值，对抗「睡眠术」时的意志检定受到-2 减值。" +
            "法师帮手（Mage Hand）:可对 5磅以内的物品使用心灵遥控。修复术（Mending）:修复目标物品的细微损伤。传讯术（Message）:可在远距离使用轻声交谈。" +
            "开关术（Open/Close）:打开或关上小或轻的目标物品。魔法技俩（Preestidigitation）:玩一些小把戏。阅读魔法（Read Magic）:阅读卷轴及法术书。" +
            "提升抗力（Resistance）:受术者的豁免检定获获得+1 加值。召唤乐器（Summon Instrument）:召唤出一项施法者指定的乐器。";
    public static String burd1="魔法警报（Alarm）:产生警报结界，持续时间为每等级 2 小时。 活化绳（Animate Rope）:造出一条魔法绳，依你的命令动作。惊恐术（Cause F"+
            "ear）:使一个5HD 以下的生物逃窜 1d4 个回合。魅惑人类（Charm Person）:使一个人类成为你的朋友。通晓语言（ComprehendLanguages）:懂得所有可说可写的语言。" +
            "治疗轻伤（Cure Light Wounds）:治疗 1d8 点伤害，每等级再多治疗+1 点，最高+5 点。侦测密门（Detect SecretDoors）:发现 60 尺内的密门。" +
            "魔法易容（Disguise Self）:改变自己的外貌。抹消术（Erase）:消除一般或魔法性的书写文字。脚底抹油（ExpeditiousRetreat）:你的速度增加 30尺。" +
            "羽落术（Feather Fall）：目标物品或生物以缓慢的速度下落。油腻术（Grease）：将 10 尺的方型区域或一个物品变的油腻。"+
            "狂笑术（Hideous Laughter）目标生物失去动作能力，持续时间 1 轮/每等级。催眠术（Hypnotism）：使生命骰数总和为 2d4 的生物群陷入迷魂状态。" +
            "鉴定术（Identify） M ：鉴识魔法物品的其中一项特性。次级困惑术（LesserConfusion）:使受术者受到困惑，持续时间为 1 轮。" +
            "魔嘴（Magic Mouth ）M:触发时会说话。涅斯图伪装灵光（Magic Aura）:改变物品的灵光。遮蔽物品（Obscure Object）:目标物品不会被探测到。" +
            "移除恐惧（Remove Fear）:压抑恐惧感，或使一个受术者的抗恐惧豁免检定+4，每 4 等级增加一对象。无声幻影（Silent Image）:造出你想要的幻影。" +
            "睡眠术（Sleep）:使生命骰数和为 4 的生物群陷入魔法昏睡。";
    public static String burd2="变身术（Alter Self）:变为类似的生物。动物使者（Animal Messenger）:将一只超小型动物送至指定地点。" +
            "迷惑动物（Animal Trance）:使生命骰数和为 2d6 的动物陷入迷魂状态。目盲术／耳聋术（BlindnessDeafness）:使受术者目盲或耳聋。" +
            "朦胧术（Blur）:对受术者的攻击会有 20%的失手几率。安定心神（Calm Emotions）:安抚生物，抵销情绪性效应。" +
            "轻灵术（Cat‘s Grace）:受术者获得+4 敏捷加值，持续时间为每等级 1 分钟。治疗中度伤（Cure ModerateWounds）:治疗 2d8 点伤害，每等级再多治疗+1 点，最高+10点。" +
            "黑暗术（Darkness）:产生半径20 尺的超自然黑暗。怪物晕眩术（DazeMonster）:6HD 以下的活物会失去下一次的动作。" +
            "减缓毒性（Delay Poison）:使毒性停止对受术者造成伤害，每等级持续 1 小时。侦测思想（Detect Thoughts）:可以观察到他人的表面想法。";
    public static String burd3="";

    //数字越大→true→越容易成功
    public static boolean d20(int number){
        Random random=new Random();
        return number>=(random.nextInt(20)+1);
    }

    public static boolean shownD20(int number){
        Random random=new Random();
        d20=random.nextInt(20)+1;
        d20haveShown=false;
        return number>=(d20);
    }

    public static String showLastD20(){
        d20haveShown=true;
        if(d20==20){
            return "[骰子]: 20 幸运女神在向你微笑";
        }else if(d20==1){
            return "[骰子]: 1 厄运女神如此厌恶你";
        }else
        return "[骰子] "+d20;
    }

    public static void die(){

    }
}