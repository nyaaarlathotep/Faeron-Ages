package com.example.cartman.faeronages.game;

import android.util.Log;
import com.example.cartman.faeronages.game.maps.Place;
import com.example.cartman.faeronages.game.maps.barrenPlain;
import com.example.cartman.faeronages.game.maps.beginnersGuide;
import com.example.cartman.faeronages.game.maps.fungalWastes;
import com.example.cartman.faeronages.game.maps.limbo;
import com.example.cartman.faeronages.game.maps.mechanus;
import com.example.cartman.faeronages.game.maps.restingYards;
import com.example.cartman.faeronages.game.maps.shore;
import com.example.cartman.faeronages.game.maps.slum;
import java.util.Random;


public class data {

    private static int d20=0;
    public static boolean d20haveShown=true;
    private static int lastLevel=0;
    private static Random random=new Random();
    public static String[] hangOut=new String[]{"[放松]正在和自己尬舞","[放松]正在和左手打架","[警戒]正在机敏的巡视四周","[警戒]正在灌木丛中躲藏","[愉悦]正在生吃史莱姆"
            ,"[放松]正在生吃马卡龙","[警戒]正在担忧接下来的战斗","[修整]正在检查装备","[修整]正在检查武器","[警戒]正在消除自己的踪迹","[修整]正在给伤口消毒","[修整]正在给伤口包扎",
            "[疑惑]这武器a下去怎么有爆炸的声音","[放松]正在洗脸","[警戒]正在搜寻猎物"};

    private static String[] mapMissions=new String[]{"去真菌荒地寻找可食用的蘑菇","去安溪庭院寻找温热的生命","去伽缝边境寻找善意的灵魂","去机械之匣寻找完整的灵魂",
            "去潮湿海岸寻找干燥的鳞片","去贫民窟寻找健康的心脏","去磺芜平原寻找茁壮的幼苗"};

       public static String home="may be it's time to go home";

    private static String[] spell0 = ("舞光术（Dancing Lights）:制造火把或其他光源。 晕眩术（Daze）:4HD 以下的人形生物会失去下一次的动作。侦测魔法（Detect Magic）:" +
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
    private static String[] spell1 = ("魔法警报（Alarm）:产生警报结界，持续时间为每等级 2 小时。 活化绳（Animate Rope）:造出一条魔法绳，依你的命令动作。惊恐术（Cause F" +
            "ear）:使一个5HD 以下的生物逃窜 1d4 个回合。魅惑人类（Charm Person）:使一个人类成为你的朋友。通晓语言（ComprehendLanguages）:懂得所有可说可写的语言。" +
            "治疗轻伤（Cure Light Wounds）:治疗 1d8 点伤害，每等级再多治疗+1 点，最高+5 点。侦测密门（Detect SecretDoors）:发现 60 尺内的密门。" +
            "魔法易容（Disguise Self）:改变自己的外貌。抹消术（Erase）:消除一般或魔法性的书写文字。脚底抹油（ExpeditiousRetreat）:你的速度增加 30尺。" +
            "羽落术（Feather Fall）：目标物品或生物以缓慢的速度下落。油腻术（Grease）：将 10 尺的方型区域或一个物品变的油腻。" +
            "狂笑术（Hideous Laughter）目标生物失去动作能力，持续时间 1 轮/每等级。催眠术（Hypnotism）：使生命骰数总和为 2d4 的生物群陷入迷魂状态。" +
            "鉴定术（Identify） M ：鉴识魔法物品的其中一项特性。次级困惑术（LesserConfusion）:使受术者受到困惑，持续时间为 1 轮。" +
            "魔嘴（Magic Mouth ）M:触发时会说话。涅斯图伪装灵光（Magic Aura）:改变物品的灵光。遮蔽物品（Obscure Object）:目标物品不会被探测到。" +
            "移除恐惧（Remove Fear）:压抑恐惧感，或使一个受术者的抗恐惧豁免检定+4，每 4 等级增加一对象。无声幻影（Silent Image）:造出你想要的幻影。" +
            "睡眠术（Sleep）:使生命骰数和为 4 的生物群陷入魔法昏睡。").split("。");
    private static String[] spell2 = ("变身术（Alter Self）:变为类似的生物。动物使者（Animal Messenger）:将一只超小型动物送至指定地点。" +
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
    private static String[] spell3 = ("闪现术（Blink）：你随机的消失、出现，持续时间 1 轮/每等级。魅惑怪物（Charm Monster）：使怪物相信它是你的盟友。" +
            "锐耳术/鹰眼术（Clairaudience/Clairvoyance）：听或看到更远的地方，持续时间 1 分钟/每等级。困惑术（Confusion）：受术者行为古怪，持续时间 1 轮/每等级。" +
            "满怀绝望（Crushing Despair）：目标攻击掷骰、伤害掷骰、豁免，以及其他所有检定均–2。治疗重伤（Cure Serious Wounds）：治疗 3d8 点伤害，每等级再多治疗 1 点，最多+15。" +
            "昼明术（Daylight）：产生半径60 尺范围的亮光。沉睡术（Deep Slumber）：使生命骰总数 10 的生物沉睡。解除魔法（Dispel Magic）：解除魔法或魔法效果。" +
            "移位术（Displacement）：攻击受术者有 50%的失手几率。恐惧术（Fear）：锥形区域内的目标群逃窜，持续时间 1 轮/每等级。气化形体（Gaseous Form）：受术者变为一团气体并能缓慢飞行。" +
            "次等指使术（Geas, Lesser）：指挥生命骰为 7 或更少的生物。舌灿莲花:「唬骗」检定获得+30加值，且谎言不会被魔法拆穿。" +
            "满怀希望（Good Hope）：目标攻击掷骰、伤害掷骰、豁免，以及所有检定均+2。加速术（Haste）：受术者移动速度加快，攻击掷骰、 AC、反射豁免检定各+1。每等级影响 1个生物。" +
            "谜幻手稿（Illusory Script ） M:只有事先指定的读者可解读此文字。隐形法球（InvisibilitySphere）:使 10 尺内所有人隐形。").split("。");
    private static String[] spell4 =("破除结界（Break Enchantment）:破除受术者所带有的附加魔法、诅咒、石化，或解除其变化。 " +
            "治疗致命伤（Cure Critical Wounds）:治疗 4d8 点伤害，每等级再多治疗+1 点，最高+20点。 侦测探知（Detect Scrying）:警告你有人使用魔法在窃听。" +
            "任意门（Dimension Door）:传送至范围内任一地点。 支配人类（Dominate Person）:使用心灵控制人形生物。 动作自如（Freedom of Movement）:受术者可以无视障碍物而如常行走。" +
            "幻景（Hallucinatory Terrain）:使某种地形看起来像是另一种（如:使原野看起来像森林）。怪物定身术（Hold Monster）:与「人类定身术」同，但可指定任意生物。 " +
            "高等隐形术（Invisibility, Greater）:与「隐形」同，但受术者进行攻击后仍可保持隐形。 通晓传奇（Legend Lore ）M F:得知一个人、地方或事物的相关传说。 " +
            "李欧蒙庇护所（Leomund’sSecureShelter）:造出坚固的屋舍。高等隐形（Invisibility, Greater）:与「隐形」同，但受术者进行攻击后仍可保持隐形。 " +
            "魅影杀手（Phantasmal Killer）:恐怖的幻象出现杀害受术者，或对其造成 3d6 点伤害。 虹彩图纹（Rainbow Pattern）:发出彩光，使生命骰数和为 24的生物群陷入迷魂。 " +
            "幽影咒法术（Shadow Conjuration）:假拟低于四级的咒法系法术，但只有 20%的真实性。 死灵操纵死尸（Animate Dead） M:制造骷髅、僵尸等不死生物。 " +
            "降咒（Bestow Curse）:单一属性值-6，或攻击检定、豁免检定、各种检定值都-4，或每次动作有 50%失手几率。 疫病术（Contagion）:使受术者感染所指定之疫病。 " +
            "弱能术（Enervation）:受术者获得 1d4 负向等级。 恐惧术（Fear）:使锥形范围内的目标群逃窜，持续时间为每等级 1 轮。 ").split("。");
    private static String[] spell5 =("集体治疗轻伤（Cure Light Wounds, Mass）:对多个生物治疗 1d8 点伤害，每等级再多治疗+1 点。 " +
            "高等解除魔法（DispelMagic,Greater）:与「解除魔法」同，但检定+20。 托梦法（Dream）:将讯息送至任何正在睡眠中的人。 " +
            "梦魇（Nightmare）:送出虚像，可造成 1d10 点伤害，并使对象疲乏。 常驻幻影（Persistent Image）:与「高等幻影」同，但不需集中精神。" +
            "集体暗示（Suggestion, Mass）:与「暗示」同，但可影响的生物个数与等级同。 五级召唤怪物术（Summon Monster V）:可召唤外界生物为你作战。" +
            "防护破除结界（Break Enchantment）:破除受术者所带有的附加魔法、诅咒、石化，或解除其变化。 驱逐术（Dismissal）:强迫生物回到原属位面。 " +
            "魔邓肯密室（Mordenkainen‘sPrivateSanctum）:防止任何人窥看或探知某区域，持续时间 24 小时。 " +
            "咒法死云术（Cloudkill）:杀害生命骰数 3 以下生物，生命骰数 4 到 6 若没通过豁免检定则死亡，生命骰数大于 6 的生物会受到体质伤害。 李" +
            "欧蒙秘藏箱（Leomund’sSecretChest）F:将贵重宝箱藏于灵界，在需要时可任意取用。 高等造物术（Major Creation）:与「次级造物术」同，但可创造石头与金属。 " +
            "魔邓肯忠犬（Mordenkainen’sFaithfulHound）:出现魅影狗，可守卫，亦可攻击。 次级异界誓缚（Planar Binding, Lesser）:困住 6HD 以下异界生物，直至" +
            "它完成工作为止。 五级召唤怪物术（Summon Monster V）:可召唤外界生物为你作战。  ").split("。");
    private static String[] spell6 = ("防护防魔法力场（Antimagic Field）:抵销 10 尺内的法术。 高等解除魔法（Dispel MagicGreater）:与「解除魔法」同，但检定+20。 " +
            "法术无效结界（Globe of Invulnerability）:与「次级法术无效结界」同，但可至四级法术。 铜墙铁壁（Guards and Wards）:一系列防护性法术与魔法效果。" +
            " 防生物力场（Repulsion）:生物无法接近你。 咒法酸雾术（Acid Fog）:产生会造成强酸伤害的浓雾。 异界誓缚（Planar Binding）：与「次级异界誓缚」同，但最高可至 12HD。 " +
            "六级召唤怪物术（Summon Monster V）:可召唤外界生物为你作战。 铁墙术（Wall of Iron） M:生命值为每 4 等级 30 点，可压在对手身上。 " +
            "预言解析咒文（Analyze Dweomer） F:发现受术者的魔法形态。 通晓传奇（Legend Lore）M F:得知一个人、地方或事物的相关传说。 " +
            "真实目光（True Seeing） M:见到所有事物的原本面貌。 附魔指使术（Geas/Quest）:与「次级指使术」同，但可以影响所有生物。 " +
            "高等英勇术（Heroism, Greater）:攻击检定、豁免检定与技能检定+4，对恐惧免疫，获得暂时生命值。").split("。");

    private static String[][] sorcererEquipment = new String[][]{"轻质头盔.10 铁头盔.20 帆布兜帽.30 魔导师兜帽.40 呓语面具.50 炉心假面.60 失落头巾.70".split(" "),
            "学徒法杖.10 导师法杖.20 异端杖.30 职业法杖.40 魔导师法杖.50 雷霆法杖.60 高阶魔导师魔杖.70 枯骨杖.80 竭心杖.90 黎明杖.100".split(" "),
            {},
            "轻质胸甲.10 铁质胸甲.20 魔导师长袍.30 充能魔甲.40 白搽灵甲.50 魔能铠甲.60".split(" "),
            "轻质腿甲.10 铁质腿甲.20 魔导师护腿.30 轻灵之靴.40 高级魔法护腿.50 奥术靴.60".split(" "),
            "护戒.10 祝福戒指.20 贪婪戒指.30 灵蛇戒指.40 蓝石戒指.50 枯骨戒.60 不详之戒.70".split(" "),
            "铁项链.10 祝福项链.20 银环项链.30 獠牙项链.40 红石项链.50 骸骨链.60".split(" ") };

    private static String[][] clericEquipment=new String[][]{"轻质头盔.10 铁头盔.20 祝福头盔.30 荣耀头盔.40 信仰盔.50".split(" "),
            {},
            "学徒法杖.10 导师法杖.20 破碎法杖.30 祝福短仗.40 微小阳光.50 光语者.60 奇迹法杖.70 阳光之仗.80".split(" "),
            "轻质胸甲.10 铁质胸甲.20 银鳞胸甲.30 祝福胸甲.40 贵族胸甲.50 太阳胸甲.60".split(" "),
            "轻质腿甲.10 铁质腿甲.20 祝福腿甲.30 高级护腿.40 贵族护腿.50 高级战靴.60 荣耀护腿.70".split(" "),
            "护戒.10 祝福戒指.20 贪婪戒指.30 灵蛇戒指.40 蓝石戒指.50 惜别戒指.60 不详之戒.70".split(" "),
            "铁项链.10 祝福项链.20 银环项链.30 獠牙项链.40 红石项链.50 失落项链.60".split(" ")};

    private static String[][] rogueEquipment=new String[][]{"奴隶头巾.10 轻质头盔.20 铁头盔.30 佣兵头罩.40 卡萨斯面巾.50 亡语面巾.60 骨面.70 流放面具.80".split(" "),
            {},
            "短匕.10 卡萨斯长刀.20 双持短刃.30 佣兵对刀.40 淬毒匕首.50 守墓对刀.60 翡翠战刃.70 亡语者.80 流放之刃.90 夺魂之镰.100 熏闸㓗之锋.90".split(" "),
            "轻质胸甲.10 铁质胸甲.20 银鳞胸甲.30 轻盈长袍.40 守墓者袍.50 流放者战袍.60 诅咒之袍.70".split(" "),
            "轻质腿甲.10 铁质腿甲.20 祝福腿甲.30 静谧靴.40 风尘靴.50 亡者靴.60".split(" "),
            "护戒.10 贪婪戒指.20 灵蛇戒指.30 蓝石戒指.40 惜别戒指.50 不详之戒.60 亡者戒.70".split(" "),
            "铁项链.10 祝福项链.20 银环项链.30 獠牙项链.40 红石项链.50 亡者项链.60".split(" ") };

    private static String[][] paladinEquipment=new String[][]{"轻质头盔.10 铁头盔.20 祝福头盔.30 荣耀头盔.40 信仰盔.50 圣光盔.60 圣武士战盔.70".split(" "),
            "木制盾牌.10 铁盾牌.20 小圆盾.30 突刺盾.40 祝福盾牌.50 信仰盾.60 圣光大盾.70".split(" "),
            "硬头锤.10 单手斧.20 双手重锤.30 流星锤.40 圣骑士战锤.50 圣光锤.60 龙头锤.70 神圣复仇者（仿）.80".split(" "),
            "轻质胸甲.10 铁质胸甲.20 银鳞胸甲.30 祝福胸甲.40 贵族胸甲.50 太阳胸甲.60 圣光铠甲.70 圣武士战甲.80".split(" "),
            "轻质腿甲.10 铁质腿甲.20 梭子腿甲.30 明亮腿甲.40 贵族腿甲.50 太阳腿甲.60".split(" "),
            "护戒.10 祝福戒指.20 宁静戒指.30 灵狐戒指.40 蓝石戒指.50 惜别戒指.60 阳光戒.70".split(" "),
            "铁项链.10 祝福项链.20 银环项链.30 獠牙项链.40 红石项链.50 圣光项链.60 太阳裂片.70".split(" ") };

    private static String[][] bardEquipment=new String[][]{"轻质头盔.10 铁头盔.20 祝福头盔.30 吟游面巾.40 薄雾面罩.50 黄昏面具.60".split(" "),
            "金属手弩.30 连弩.40 雷霆连弩.50 卡萨斯连弩.60 卡萨斯直剑.70 箭雨弩.80".split(" "),
            "轻质单手剑.10 短柄斧.20 淬毒匕首.50 宝石对刀.60 翡翠战刃.70 风语者.80 熏闸㓗之锋.90".split(" "),
            "轻质胸甲.10 铁质胸甲.20 银鳞胸甲.30 祝福胸甲.40 贵族胸甲.50 吟游者长袍.60".split(" "),
            "轻质腿甲.10 铁质腿甲.20 祝福腿甲.30 华丽腿甲.40 贵族绑腿.50 宝石绑腿.60".split(" "),
            "护戒.10 祝福戒指.20 贪婪戒指.30 灵蛇戒指.40 蓝石戒指.50 惜别戒指.60 魅力之戒.70 自走炮戒指.80".split(" "),
            "铁项链.10 祝福项链.20 银环项链.30 獠牙项链.40 红石项链.50 塞壬之心.80 海妖之鳍.90".split(" ") };

    private static String[][] druidEquipment=new String[][]{"轻质头盔.10 铁头盔.20 祝福头盔.30 鲜花面具.40 自然之力面具.50 守护者面具.60".split(" "),
            {},
            "镰刀.10 链状刀.20 精制长矛.30 铁质飞镖.40 淬毒飞镖.50 狩猎者战矛.60 卡萨斯钩刀.70".split(" "),
            "轻质胸甲.10 铁质胸甲.20 银鳞胸甲.30 祝福胸甲.40 自然之力铠甲.50 守护者胸甲.60".split(" "),
            "轻质腿甲.10 铁质腿甲.20 祝福腿甲.30 高级护腿.40 贵族护腿.50 高级战靴.60 自然之力战靴.70 守护者之靴.80".split(" "),
            "护戒.10 祝福戒指.20 贪婪戒指.30 灵蛇戒指.40 蓝石戒指.50 自然之力戒指.60 守护者之戒.70".split(" "),
            "铁项链.10 祝福项链.20 银环项链.30 獠牙项链.40 红石项链.50 自然之链.60 守护者项链.70".split(" ")};

    private static String[][] fighterEquipment=new String[][]{"轻质头盔.10 铁头盔.20 祝福头盔.30 荣耀头盔.40 信仰盔.50 龙头盔.60 王者战盔.70 遗落战盔.80 巨龙战盔（仿）.90".split(" "),
            "木制盾牌.10 铁盾牌.20 小圆盾.30 突刺盾.40 祝福盾牌.50 猎龙大盾.60 惩罚者大盾.70 战神巨盾.80".split(" "),
            "直剑.10 阔剑.20 战斧.30 双刃战斧.40 巨剑.50 复仇者大剑.60 流放者大刀.70 卡萨斯特大剑.80 追龙斧.90 猎龙大斧.100 毁灭者.110 熏闸㓗之臂.90".split(" "),
            "轻质胸甲.10 铁质胸甲.20 银鳞胸甲.30 祝福胸甲.40 厚质重甲.50 圣战士铠甲.60 古达铠甲.70 猎龙铠甲.80".split(" "),
            "轻质腿甲.10 铁质腿甲.20 祝福腿甲.30 华丽腿甲.40 贵族绑腿.50 宝石绑腿.60".split(" "),
            "护戒.10 祝福戒指.20 贪婪戒指.30 灵蛇戒指.40 蓝石戒指.50 武神战戒.60 王者之戒.70".split(" "),
            "铁项链.10 祝福项链.20 银环项链.30 獠牙项链.40 红石项链.50 武神项链.60 不灭之链.70".split(" ")};

    private static String[] equipmentStatement="战痕累累的.-7 破碎的.-5 粗劣的.-2 普通的.0 精制的.2 卓越的.4 无双的.6 不朽的.9 传奇的.2 王者的.5".split(" ");

//    index作为判断装备类型的数据，用空格隔开返回
    public static String getAEquipment(jobs job){
        String subscribe=equipmentStatement[random.nextInt(equipmentStatement.length)];
        switch (job){
            case fighter:{
                int index=random.nextInt(fighterEquipment.length);
                while (fighterEquipment[index].length==0){
                    index=random.nextInt(fighterEquipment.length);
                }
                String equip=fighterEquipment[index][random.nextInt(fighterEquipment[index].length)];
                Log.d("fighter equipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case bard:{
                int index=random.nextInt(bardEquipment.length);
                while (bardEquipment[index].length==0){
                    index=random.nextInt(bardEquipment.length);
                }
                String equip=bardEquipment[index][random.nextInt(bardEquipment[index].length)];
                Log.d("bardEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case druid:{
                int index=random.nextInt(druidEquipment.length);
                while (druidEquipment[index].length==0){
                    index=random.nextInt(druidEquipment.length);
                }
                String equip=druidEquipment[index][random.nextInt(druidEquipment[index].length)];
                Log.d("druidEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case cleric:{
                int index=random.nextInt(clericEquipment.length);
                while (clericEquipment[index].length==0){
                    index=random.nextInt(clericEquipment.length);
                }
                String equip=clericEquipment[index][random.nextInt(clericEquipment[index].length)];
                Log.d("clericEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case rogue:{
                int index=random.nextInt(rogueEquipment.length);
                while (rogueEquipment[index].length==0){
                    index=random.nextInt(rogueEquipment.length);
                }
                String equip=rogueEquipment[index][random.nextInt(rogueEquipment[index].length)];
                Log.d("rogueEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case paladin:{
                int index=random.nextInt(paladinEquipment.length);
                while (paladinEquipment[index].length==0){
                    index=random.nextInt(paladinEquipment.length);
                }
                String equip=paladinEquipment[index][random.nextInt(paladinEquipment[index].length)];
                Log.d("paladinEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case sorcerer:{
                int index=random.nextInt(sorcererEquipment.length);
                while (sorcererEquipment[index].length==0){
                    index=random.nextInt(sorcererEquipment.length);
                }
                String equip=sorcererEquipment[index][random.nextInt(sorcererEquipment[index].length)];
                Log.d("sorcererEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            default:{
                return "error";
            }
        }
    }


    public static String getASpell(String[] spells,int level){
            if (level <= 3) {
                String spel = spell0[random.nextInt(spell0.length)];
                boolean hasSame = false;
                for (String s : spells[0].split("\n")) {
                    if (s.equals(spel)) {
                        hasSame = true;
                    }
                }
                    if(hasSame){
                        return getASpell(spells,level);
                    }else {
                        return spel+","+"0";
                    }
            } else if (level < 10) {
                int as=random.nextInt(spell0.length);
                String spel = spell0[as];
                int index=random.nextInt(100);
                if(index<=50){
                    index=0;
                }else if(index<=65){
                    spel = spell1[random.nextInt(spell1.length)];
                    index=1;
                }else {
                    spel = spell2[random.nextInt(spell2.length)];
                    index=2;
                }
                boolean hasSame = false;
                for (String s : spells[index].split("\n")) {
                    if (s.equals(spel)) {
                        hasSame = true;
                    }
                }
                if(hasSame){
                    return getASpell(spells,level);
                }else {
                    return spel+","+index;
                }
            } else if (level < 18) {
                String spel = spell0[random.nextInt(spell0.length)];
                int index=random.nextInt(100);
                if(index<=50){
                    index=0;
                }else if(index<=65){
                    spel = spell1[random.nextInt(spell1.length)];
                    index=1;
                }else if(index<=74){
                    spel = spell2[random.nextInt(spell2.length)];
                    index=2;
                }else {
                    spel = spell3[random.nextInt(spell3.length)];
                    index=3;
                }
                boolean hasSame = false;
                for (String s : spells[index].split("\n")) {
                    if (s.equals(spel)) {
                        hasSame = true;
                    }
                }
                if(hasSame){
                    return getASpell(spells,level);
                }else {
                    return spel+","+index;
                }
            }else if(level<25){
                String spel = spell0[random.nextInt(spell0.length)];
                int index=random.nextInt(100);
                if(index<=50){
                    index=0;
                }else if(index<=65){
                    spel = spell1[random.nextInt(spell1.length)];
                    index=1;
                }else if(index<=74){
                    spel = spell2[random.nextInt(spell2.length)];
                    index=2;
                }else if(index<=82){
                    spel = spell3[random.nextInt(spell3.length)];
                    index=3;
                }else {
                    spel = spell4[random.nextInt(spell4.length)];
                    index=4;
                }
                boolean hasSame = false;
                for (String s : spells[index].split("\n")) {
                    if (s.equals(spel)) {
                        hasSame = true;
                    }
                }
                if(hasSame){
                    return getASpell(spells,level);
                }else {
                    return spel+","+index;
                }
            }else if(level<36){
                String spel = spell0[random.nextInt(spell0.length)];
                int index=random.nextInt(100);
                if(index<=50){
                    index=0;
                }else if(index<=65){
                    spel = spell1[random.nextInt(spell1.length)];
                    index=1;
                }else if(index<=74){
                    spel = spell2[random.nextInt(spell2.length)];
                    index=2;
                }else if(index<=82){
                    spel = spell3[random.nextInt(spell3.length)];
                    index=3;
                }else if(index<=90){
                    spel = spell4[random.nextInt(spell4.length)];
                    index=4;
                }else{
                    spel = spell5[random.nextInt(spell5.length)];
                    index=5;
                }
                boolean hasSame = false;
                for (String s : spells[index].split("\n")) {
                    if (s.equals(spel)) {
                        hasSame = true;
                    }
                }
                if(hasSame){
                    return getASpell(spells,level);
                }else {
                    return spel+","+index;
                }
            }else if(level<48){
                String spel = spell0[random.nextInt(spell0.length)];
                int index=random.nextInt(100);
                if(index<=50){
                    index=0;
                }else if(index<=65){
                    spel = spell1[random.nextInt(spell1.length)];
                    index=1;
                }else if(index<=74){
                    spel = spell2[random.nextInt(spell2.length)];
                    index=2;
                }else if(index<=82){
                    spel = spell3[random.nextInt(spell3.length)];
                    index=3;
                }else if(index<=90){
                    spel = spell4[random.nextInt(spell4.length)];
                    index=4;
                }else if(index<=95){
                    spel = spell5[random.nextInt(spell5.length)];
                    index=5;
                }else {
                    spel = spell6[random.nextInt(spell6.length)];
                    index=6;
                }
                boolean hasSame = false;
                for (String s : spells[index].split("\n")) {
                    if (s.equals(spel)) {
                        hasSame = true;
                    }
                }
                if(hasSame){
                    return getASpell(spells,level);
                }else {
                    return spel+","+index;
                }
            }else {
                String spel = spell0[random.nextInt(spell0.length)];
                int index=0;

                boolean hasSame = false;
                for (String s : spells[index].split("\n")) {
                    if (s.equals(spel)) {
                        hasSame = true;
                    }
                }
                if(hasSame){
                    return getASpell(spells,level);
                }else {
                    return spel+","+index;
                }
            }
    }

    public static String getMission(int level){
        int index=random.nextInt(mapMissions.length);
        return mapMissions[index];
    }

    public static String getRandomEquipment(jobs job){
        String subscribe=equipmentStatement[random.nextInt(equipmentStatement.length)];
        switch (job){
            case fighter:{
                int index=random.nextInt(fighterEquipment.length);
                String equip=fighterEquipment[index][random.nextInt(fighterEquipment[index].length)];
                Log.d("fighter equipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case bard:{
                int index=random.nextInt(bardEquipment.length);
                while (bardEquipment[index].length==0){
                    index=random.nextInt(bardEquipment.length);
                }
                String equip=bardEquipment[index][random.nextInt(bardEquipment[index].length)];
                Log.d("bardEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case druid:{
                int index=random.nextInt(druidEquipment.length);
                String equip=druidEquipment[index][random.nextInt(druidEquipment[index].length)];
                Log.d("druidEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case cleric:{
                int index=random.nextInt(clericEquipment.length);
                String equip=clericEquipment[index][random.nextInt(clericEquipment[index].length)];
                Log.d("clericEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case rogue:{
                int index=random.nextInt(rogueEquipment.length);
                String equip=rogueEquipment[index][random.nextInt(rogueEquipment[index].length)];
                Log.d("rogueEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case paladin:{
                int index=random.nextInt(paladinEquipment.length);
                String equip=paladinEquipment[index][random.nextInt(paladinEquipment[index].length)];
                Log.d("paladinEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            case sorcerer:{
                int index=random.nextInt(sorcererEquipment.length);
                String equip=sorcererEquipment[index][random.nextInt(sorcererEquipment[index].length)];
                Log.d("sorcererEquipment",equip);
                equip=subscribe.split("\\.")[0]+equip.split("\\.")[0]+"."+
                        (Integer.parseInt(subscribe.split("\\.")[1])+Integer.parseInt(equip.split("\\.")[1]));
                return equip+","+index;
            }
            default:{
                return "error";
            }
        }
    }

    public static Place getAMap(){
        int map=random.nextInt(7);
        switch (map){
            case 0:{
                return new fungalWastes();
            }
            case 1:{
                return new limbo();
            }
            case 2:{
                return new mechanus();
            }
            case 3:{
                return new restingYards();
            }
            case 4:{
                return new shore();
            }
            case 5:{
                return new slum();
            }
            case 6:{
                return new barrenPlain();
            }
        }
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
            return "[骰子]:20 幸运女神迷恋你";
        }else if(d20==1){
            return "[骰子]:1 厄运女神厌恶你";
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