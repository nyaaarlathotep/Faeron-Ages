package com.example.cartman.faeronages.game;



import com.example.cartman.faeronages.game.maps.Place;
import com.example.cartman.faeronages.game.maps.beginnersGuide;

import java.util.Random;


public class data {

    public static int d20=0;
    public static boolean d20haveShown=true;
    private static int lastLevel=0;
    private static Random random=new Random();
    public static String[] hangOut=new String[]{"[放松]正在和自己尬舞","[放松]正在和左手打架","[警戒]正在机敏的巡视四周","[警戒]正在灌木丛中躲藏","[愉悦]正在生吃史莱姆"
            ,"[放松]正在生吃马卡龙","[警戒]正在担忧接下来的战斗","[修整]正在检查装备","[修整]正在检查武器","[警戒]正在消除自己的踪迹","[修整]正在给伤口消毒","[修整]正在给伤口包扎",
            "[疑惑]这武器a下去怎么有爆炸的声音","[放松]正在洗脸","[警戒]正在搜寻猎物"};

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

    public static String[] spell0 = ("舞光术（Dancing Lights）:制造火把或其他光源。 晕眩术（Daze）:4HD 以下的人形生物会失去下一次的动作。侦测魔法（Detect Magic）:" +
            "侦测 60 尺内的法术或魔法物品。闪光术（Flare）:使一个生物目眩（攻击检定-1）。幻音术（Ghost Sound）:发出虚幻的假声。指北术（Know Direction）:指" +
            "出北方。光亮术（Light）:使目标物品如火把般发光。 瞌睡术（Lullaby）:使受术者昏昏欲睡，「侦察」与「聆听」检定受到-5 减值，对抗「睡眠术」时的意志检定受到-2 减值。" +
            "法师帮手（Mage Hand）:可对 5磅以内的物品使用心灵遥控。修复术（Mending）:修复目标物品的细微损伤。传讯术（Message）:可在远距离使用轻声交谈。" +
            "开关术（Open/Close）:打开或关上小或轻的目标物品。魔法技俩（Preestidigitation）:玩一些小把戏。阅读魔法（Read Magic）:阅读卷轴及法术书。" +
            "提升抗力（Resistance）:受术者的豁免检定获获得+1 加值。召唤乐器（Summon Instrument）:召唤出一项施法者指定的乐器。" +
            "防护提升抗力（Resistance）:受术者的豁免检定获得+1 加值。 咒法强酸四溅（Acid Splash）:球形，造成 1d3 点强酸伤害。 " +
            "预言侦测毒性（Detect Poison）:侦测一个生物或小型物体所带有的毒性。 侦测魔法（Detect Magic）:侦测 60 尺内的法术或魔法物品。 " +
            "阅读魔法（Read Magic）:阅读卷轴及法术书。 附魔晕眩术（Daze）:4HD 以下的人形生物会失去下一次的动作。 塑能舞光术（Dancing Lights）:制造火把或其他光源。 " +
            "闪光术（Flare）:使一个生物目眩（攻击检定-1）。 光亮术（Light）:使目标物品如火把般发光。 冷冻射线（Ray of Frost）:发出射线，造成 1d3 点冷冻伤害。" +
            "幻术幻音术（Ghost Sound）:发出虚幻的假声。 死灵打击死灵（Disrupt Undead）:对一个不死生物造成1d6 点伤害。 " +
            "疲乏之触（Touch of Fatigue）:接触攻击，成功可使目标疲乏。变化法师帮手（Mage Hand）：可对 5 磅以内的物品使用心灵遥控。 " +
            "修复术（Mending）:修复目标物品的细微损伤。 传讯术（Message）:可在远距离使用轻声交谈。 开关术（Open/Close）:打开或关上小或轻的目标物品。 " +
            "共通秘法印记（Arcane Mark）:刻上可见或不可见的个人记号。 魔法技俩（Prestidigitation）:玩一些小把戏。 ").split("。");
    public static String[] spell1 = ("魔法警报（Alarm）:产生警报结界，持续时间为每等级 2 小时。 活化绳（Animate Rope）:造出一条魔法绳，依你的命令动作。惊恐术（Cause F" +
            "ear）:使一个5HD 以下的生物逃窜 1d4 个回合。魅惑人类（Charm Person）:使一个人类成为你的朋友。通晓语言（ComprehendLanguages）:懂得所有可说可写的语言。" +
            "治疗轻伤（Cure Light Wounds）:治疗 1d8 点伤害，每等级再多治疗+1 点，最高+5 点。侦测密门（Detect SecretDoors）:发现 60 尺内的密门。" +
            "魔法易容（Disguise Self）:改变自己的外貌。抹消术（Erase）:消除一般或魔法性的书写文字。脚底抹油（ExpeditiousRetreat）:你的速度增加 30尺。" +
            "羽落术（Feather Fall）：目标物品或生物以缓慢的速度下落。油腻术（Grease）：将 10 尺的方型区域或一个物品变的油腻。" +
            "狂笑术（Hideous Laughter）目标生物失去动作能力，持续时间 1 轮/每等级。催眠术（Hypnotism）：使生命骰数总和为 2d4 的生物群陷入迷魂状态。" +
            "鉴定术（Identify） M ：鉴识魔法物品的其中一项特性。次级困惑术（LesserConfusion）:使受术者受到困惑，持续时间为 1 轮。" +
            "魔嘴（Magic Mouth ）M:触发时会说话。涅斯图伪装灵光（Magic Aura）:改变物品的灵光。遮蔽物品（Obscure Object）:目标物品不会被探测到。" +
            "移除恐惧（Remove Fear）:压抑恐惧感，或使一个受术者的抗恐惧豁免检定+4，每 4 等级增加一对象。无声幻影（Silent Image）:造出你想要的幻影。" +
            "睡眠术（Sleep）:使生命骰数和为 4 的生物群陷入魔法昏睡。").split("。");
    public static String[] spell2 = ("变身术（Alter Self）:变为类似的生物。动物使者（Animal Messenger）:将一只超小型动物送至指定地点。" +
            "迷惑动物（Animal Trance）:使生命骰数和为 2d6 的动物陷入迷魂状态。目盲术／耳聋术（BlindnessDeafness）:使受术者目盲或耳聋。" +
            "朦胧术（Blur）:对受术者的攻击会有 20%的失手几率。安定心神（Calm Emotions）:安抚生物，抵销情绪性效应。" +
            "轻灵术（Cat‘s Grace）:受术者获得+4 敏捷加值，持续时间为每等级 1 分钟。治疗中度伤（Cure ModerateWounds）:治疗 2d8 点伤害，每等级再多治疗+1 点，最高+10点。" +
            "黑暗术（Darkness）:产生半径20 尺的超自然黑暗。怪物晕眩术（DazeMonster）:6HD 以下的活物会失去下一次的动作。" +
            "减缓毒性（Delay Poison）:使毒性停止对受术者造成伤害，每等级持续 1 小时。侦测思想（Detect Thoughts）:可以观察到他人的表面想法。" +
            "失智之触（Touch of Idiocy）:受术者会遭受 1d6 点智力、感知与魅力伤害。 塑能不灭明焰（Continual Flame）M:造出一支永远不灭，不会发热的火把。" +
            "黑暗术（Darkness）:产生半径20 尺的超自然黑暗。 炽焰法球（Flaming Sphere）:滚出一团火球，造成 2d6 点伤害，持续时间为每等级 1 轮。 " +
            "造风术（Gust of Wind）:刮走或吹倒小型生物。 焦灼射线（Scorching Ray）:远程接触攻击，可造成 4d6 点火焰伤害，每等级再多 1 道射线，最多+3 道。 " +
            "粉碎音波（Shatter）:发出高速震动音波，足以伤害目标物品或晶体生物。 幻术朦胧术（Blur）:对受术者的攻击会有 20%的失手几率。 " +
            "催眠图纹（Hypnotic Pattern）:使生命骰数和为「2d4+施法者等级」的生物群陷入迷魂状态。" +
            "隐形（Invisibility）:受术者隐形，持续时间为每等级 1 分钟，或直到进行攻击为止。 ").split("。");
    public static String[] spell3 = ("闪现术（Blink）：你随机的消失、出现，持续时间 1 轮/每等级。魅惑怪物（Charm Monster）：使怪物相信它是你的盟友。" +
            "锐耳术/鹰眼术（Clairaudience/Clairvoyance）：听或看到更远的地方，持续时间 1 分钟/每等级。困惑术（Confusion）：受术者行为古怪，持续时间 1 轮/每等级。" +
            "满怀绝望（Crushing Despair）：目标攻击掷骰、伤害掷骰、豁免，以及其他所有检定均–2。治疗重伤（Cure Serious Wounds）：治疗 3d8 点伤害，每等级再多治疗 1 点，最多+15。" +
            "昼明术（Daylight）：产生半径60 尺范围的亮光。沉睡术（Deep Slumber）：使生命骰总数 10 的生物沉睡。解除魔法（Dispel Magic）：解除魔法或魔法效果。" +
            "移位术（Displacement）：攻击受术者有 50%的失手几率。恐惧术（Fear）：锥形区域内的目标群逃窜，持续时间 1 轮/每等级。气化形体（Gaseous Form）：受术者变为一团气体并能缓慢飞行。" +
            "次等指使术（Geas, Lesser）：指挥生命骰为 7 或更少的生物。舌灿莲花:「唬骗」检定获得+30加值，且谎言不会被魔法拆穿。" +
            "满怀希望（Good Hope）：目标攻击掷骰、伤害掷骰、豁免，以及所有检定均+2。加速术（Haste）：受术者移动速度加快，攻击掷骰、 AC、反射豁免检定各+1。每等级影响 1个生物。" +
            "谜幻手稿（Illusory Script ） M:只有事先指定的读者可解读此文字。隐形法球（InvisibilitySphere）:使 10 尺内所有人隐形。").split("。");
    public static String[] spell4 =("破除结界（Break Enchantment）:破除受术者所带有的附加魔法、诅咒、石化，或解除其变化。 " +
            "治疗致命伤（Cure Critical Wounds）:治疗 4d8 点伤害，每等级再多治疗+1 点，最高+20点。 侦测探知（Detect Scrying）:警告你有人使用魔法在窃听。" +
            "任意门（Dimension Door）:传送至范围内任一地点。 支配人类（Dominate Person）:使用心灵控制人形生物。 动作自如（Freedom of Movement）:受术者可以无视障碍物而如常行走。" +
            "幻景（Hallucinatory Terrain）:使某种地形看起来像是另一种（如:使原野看起来像森林）。怪物定身术（Hold Monster）:与「人类定身术」同，但可指定任意生物。 " +
            "高等隐形术（Invisibility, Greater）:与「隐形」同，但受术者进行攻击后仍可保持隐形。 通晓传奇（Legend Lore ）M F:得知一个人、地方或事物的相关传说。 " +
            "李欧蒙庇护所（Leomund’sSecureShelter）:造出坚固的屋舍。高等隐形（Invisibility, Greater）:与「隐形」同，但受术者进行攻击后仍可保持隐形。 " +
            "魅影杀手（Phantasmal Killer）:恐怖的幻象出现杀害受术者，或对其造成 3d6 点伤害。 虹彩图纹（Rainbow Pattern）:发出彩光，使生命骰数和为 24的生物群陷入迷魂。 " +
            "幽影咒法术（Shadow Conjuration）:假拟低于四级的咒法系法术，但只有 20%的真实性。 死灵操纵死尸（Animate Dead） M:制造骷髅、僵尸等不死生物。 " +
            "降咒（Bestow Curse）:单一属性值-6，或攻击检定、豁免检定、各种检定值都-4，或每次动作有 50%失手几率。 疫病术（Contagion）:使受术者感染所指定之疫病。 " +
            "弱能术（Enervation）:受术者获得 1d4 负向等级。 恐惧术（Fear）:使锥形范围内的目标群逃窜，持续时间为每等级 1 轮。 ").split("。");
    public static String[] spell5 =("集体治疗轻伤（Cure Light Wounds, Mass）:对多个生物治疗 1d8 点伤害，每等级再多治疗+1 点。 " +
            "高等解除魔法（DispelMagic,Greater）:与「解除魔法」同，但检定+20。 托梦法（Dream）:将讯息送至任何正在睡眠中的人。 " +
            "梦魇（Nightmare）:送出虚像，可造成 1d10 点伤害，并使对象疲乏。 常驻幻影（Persistent Image）:与「高等幻影」同，但不需集中精神。" +
            "集体暗示（Suggestion, Mass）:与「暗示」同，但可影响的生物个数与等级同。 五级召唤怪物术（Summon Monster V）:可召唤外界生物为你作战。" +
            "防护破除结界（Break Enchantment）:破除受术者所带有的附加魔法、诅咒、石化，或解除其变化。 驱逐术（Dismissal）:强迫生物回到原属位面。 " +
            "魔邓肯密室（Mordenkainen‘sPrivateSanctum）:防止任何人窥看或探知某区域，持续时间 24 小时。 " +
            "咒法死云术（Cloudkill）:杀害生命骰数 3 以下生物，生命骰数 4 到 6 若没通过豁免检定则死亡，生命骰数大于 6 的生物会受到体质伤害。 李" +
            "欧蒙秘藏箱（Leomund’sSecretChest）F:将贵重宝箱藏于灵界，在需要时可任意取用。 高等造物术（Major Creation）:与「次级造物术」同，但可创造石头与金属。 " +
            "魔邓肯忠犬（Mordenkainen’sFaithfulHound）:出现魅影狗，可守卫，亦可攻击。 次级异界誓缚（Planar Binding, Lesser）:困住 6HD 以下异界生物，直至" +
            "它完成工作为止。 五级召唤怪物术（Summon Monster V）:可召唤外界生物为你作战。  ").split("。");
    public static String[] spell6 = ("防护防魔法力场（Antimagic Field）:抵销 10 尺内的法术。 高等解除魔法（Dispel MagicGreater）:与「解除魔法」同，但检定+20。 " +
            "法术无效结界（Globe of Invulnerability）:与「次级法术无效结界」同，但可至四级法术。 铜墙铁壁（Guards and Wards）:一系列防护性法术与魔法效果。" +
            " 防生物力场（Repulsion）:生物无法接近你。 咒法酸雾术（Acid Fog）:产生会造成强酸伤害的浓雾。 异界誓缚（Planar Binding）：与「次级异界誓缚」同，但最高可至 12HD。 " +
            "六级召唤怪物术（Summon Monster V）:可召唤外界生物为你作战。 铁墙术（Wall of Iron） M:生命值为每 4 等级 30 点，可压在对手身上。 " +
            "预言解析咒文（Analyze Dweomer） F:发现受术者的魔法形态。 通晓传奇（Legend Lore）M F:得知一个人、地方或事物的相关传说。 " +
            "真实目光（True Seeing） M:见到所有事物的原本面貌。 附魔指使术（Geas/Quest）:与「次级指使术」同，但可以影响所有生物。 " +
            "高等英勇术（Heroism, Greater）:攻击检定、豁免检定与技能检定+4，对恐惧免疫，获得暂时生命值。").split("。");



    public static String[] getSpell(String[] spells,int level){
        if(level!=lastLevel) {
            lastLevel = level;
            if (level <= 3) {
                spellTool(spells, 0);
                return spellTool(spells, 0);
            } else if (level < 10) {
                spells = spellTool(spells, 0);
                spells = spellTool(spells, 1);
                return spells;
            } else if (level < 18) {
                spells=spellTool(spells,0);
                spells=spellTool(spells,1);
                spells=spellTool(spells,2);
                return spells;
            }else if(level<25){
                spells=spellTool(spells,0);
                spells=spellTool(spells,1);
                spells=spellTool(spells,2);
                spells=spellTool(spells,3);
                return spells;
            }else if(level<36){
                spells=spellTool(spells,0);
                spells=spellTool(spells,1);
                spells=spellTool(spells,2);
                spells=spellTool(spells,3);
                spells=spellTool(spells,4);
                return spells;
            }else if(level<48){
                spells=spellTool(spells,1);
                spells=spellTool(spells,2);
                spells=spellTool(spells,3);
                spells=spellTool(spells,4);
                spells=spellTool(spells,5);
                spells=spellTool(spells,6);
                return spells;
            }else {
                return spells;
            }
        }
        else return spells;
    }

    public static String getMission(int level){
        return "杀一只鸡";
    }
    public static String getEquipment(int level,jobs job){
        return "大鸡腿";
    }
    public static String getRandomEquipment(jobs job){
        return "小鸡腿";
    }

    public static Place getAMap(){
        return new beginnersGuide();
    }

    //数字越大→true→越容易成功
    public static boolean d20(int number){
        return number>=(random.nextInt(20)+1);
    }

    public static boolean shownD20(int number){

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


    private static String[] spellTool(String[] spells,int spellLevel){
        while(true) {
            String spp=getASpell(spellLevel);
            if(!spells[spellLevel].contains(spp)){
                spells[spellLevel]=spells[spellLevel].concat(spp+"\n");
                break;
            }
        }
        return spells;
    }

    private static String getASpell(int spellLevel){
        Random random=new Random();
        switch (spellLevel){
            case 0:{
                int sp=random.nextInt(spell0.length);
                return spell0[sp];
            }
            case 1:{
                int sp=random.nextInt(spell1.length);
                return spell1[sp];
            }
            case 2:{
                int sp=random.nextInt(spell2.length);
                return spell2[sp];
            }
            case 3:{
                int sp=random.nextInt(spell3.length);
                return spell3[sp];
            }
            case 4:{
                int sp=random.nextInt(spell4.length);
                return spell4[sp];
            }
            case 5:{
                int sp=random.nextInt(spell5.length);
                return spell5[sp];
            }
            case 6:{
                int sp=random.nextInt(spell6.length);
                return spell6[sp];
            }
            default:{
                return "error";
            }
        }
    }
}