package com.stylefeng.guns.insurance.constant;

/**
 * 业务常量
 * @author Administrator
 *
 */
public interface BizConstant {

	/**
	 * 性别
	 * @author Administrator
	 *
	 */
	public interface Sex{
		/**
		 * 男
		 */
		public static final String MAN="1";
		/**
		 * 女
		 */
		public static final String WOMAN="2";
		/**
		 * 未说明
		 */
		public static final String UNKNOW="9";
	}
	
	/**
	 * 核保状态
	 * @author Administrator
	 *
	 */
	public interface UnderWriting{
		/**
		 * 核保通过
		 */
		public static final String PASS_THROUGH="1";
		/**
		 * 核保不通过
		 */
		public static final String NOT_TO_PASS_THROUGH="2";
		/**
		 * 自动核保
		 */
		public static final String AUTOMATIC_SECURITY="3";
		/**
		 * 拒保
		 */
		public static final String REPELLENT="4";
		/**
		 * 复核通过
		 */
		public static final String REVIEW_AND_PASS_THROUGH="5";
		/**
		 * 承保确认
		 */
		public static final String UNDERWRITING_CONFIRMATION="6";
		/**
		 * 复核不通过
		 */
		public static final String REVIEW_DOES_NOT_PASS="7";
		/**
		 * 待复核
		 */
		public static final String RECHECK="8";
		/**
		 * 待核保
		 */
		public static final String TO_BE_INSURED="9";
	}
	
	
	/**
	 * 证件类型
	 * @author Administrator
	 *
	 */
	public interface IdentifyTypeAll{
		/**
		 * 居民身份证
		 */
		public static final String RESIDENT_IDENTITY_CARD="01";
		/**
		 * 护照
		 */
		public static final String PASSPORT="02";
		/**
		 * 军人证
		 */
		public static final String THE_MILITARY_CARD="03";
		/**
		 * 驾驶证
		 */
		public static final String  DRIVERS_LICENSE="04";
		/**
		 * 港澳台同胞证
		 */
		public static final String COMPATRIOT_CARD_HONGKONG_TAIWAN="05";
		/**
		 * 中国护照
		 */
		public static final String CHINESE_PASSPORT="07";
		/**
		 * 组织机构代码证
		 */
		public static final String ORGANIZATION_CODE_CERTIFICATE="1";
		/**
		 * 税务登记证
		 */
		public static final String TAX_REGISTRATION_CERTIFICATE="2";
		/**
		 * 营业执照
		 */
		public static final String BUSINESS_LICENSE="3";
		/**
		 * 其他
		 */
		public static final String OTHER="99";
	}
	
	
	/**
	 * 被保险人与投保人关系
	 * @author Administrator
	 *
	 */
	public interface AppliRelation{
		/**
		 * 本人
		 */
		public static final String ONESELF="01";
		/**
		 * 配偶
		 */
		public static final String SPOUSE="10";
		/**
		 * 丈夫
		 */
		public static final String HUSBAND="11";
		/**
		 * 妻子
		 */
		public static final String WIFE="12";
		/**
		 * 儿子
		 */
		public static final String SON="20";
		/**
		 * 女儿
		 */
		public static final String DAUGHTER="30";
		/**
		 * 儿女
		 */
		public static final String CHILDREN="40";
		/**
		 * 父母
		 */
		public static final String PARENT="50";
		/**
		 * 父亲
		 */
		public static final String FATHER="51";
		/**
		 * 母亲
		 */
		public static final String MOTHER="52";
		/**
		 * 继父
		 */
		public static final String STEPFATHER="53";
		/**
		 * 继母
		 */
		public static final String STEPMOTHER="54";
		/**
		 * 叔伯
		 */
		public static final String UNCLES="55";
		/**
		 * 阿姨
		 */
		public static final String AUNT="56";
		/**
		 * 姐妹
		 */
		public static final String SISTERS="58";
		/**
		 * 外公
		 */
		public static final String GRANDPA="59";
		/**
		 * 亲属
		 */
		public static final String RELATIVES="60";
		/**
		 * 兄弟
		 */
		public static final String BROTHER="61";
		/**
		 * 奶奶
		 */
		public static final String GRANDMA="62";
		/**
		 * 单位
		 */
		public static final String COMPANY="80";
		/**
		 * 雇员
		 */
		public static final String EMPLOYEE="81";
		/**
		 * 雇主
		 */
		public static final String EMPLOYEE_MASTER="82";
		/**
		 * 其他
		 */
		public static final String OTHER="99";
	}
	
	
	/**
	 * 关系人标志
	 * @author Administrator
	 *
	 */
	public interface InsuredFlag{
		/**
		 * 投保人
		 */
		public static final String POLICY_HOLDER="1";
		/**
		 * 被保险人
		 */
		public static final String INSURANT="2";
		/**
		 * 连带被保险人
		 */
		public static final String JOINT_INSURER="3";
		/**
		 * 受益人
		 */
		public static final String BENEFICIARY="4";
	}
	
	/**
	 * 活动性质
	 * @author Administrator
	 *
	 */
	public interface UnderWritingConstant{
		/**
		 * 室内非体育活动
		 */
		public static final String INDOOR_NON_SPORTS_ACTIVITIES="1";
		/**
		 * 室外展会
		 */
		public static final String OUTDOOR_EXHIBITION="2";
		/**
		 * 室内非竞技体育活动
		 */
		public static final String INDOOR_NON_COMPETITIVE_SPORTS_ACTIVITIES="3";
		/**
		 * 室内竞技活动
		 */
		public static final String INDOOR_COMPETITIVE_ACTIVITIES="4";
		/**
		 * 第一类户外运动：户外旅游，包括远足徒步、健身登山、露营、山地越野
		 */
		public static final String FIRST_TYPE_OF_OUTDOOR_SPORTS="5";
		/**
		 * 第二类户外运动：一般户外运动，包括登山户外运动（3500米以下），自行车旅行、骑马、划船、游泳、拓展运动、人工场地攀岩、山地穿越、水上户外
		 */
		public static final String SECOND_TYPES_OF_OUTDOOR_SPORTS="6";
		/**
		 * 第三类户外运动：技术型户外运动，包括技术型登山户外运动（3500米以下），定向越野、帆船、帆板、皮划艇、漂流、溯溪、轮滑、绳降、自然场地攀岩、野外生存、山地自行车、场地滑雪、直升机、热气球、小型飞机飞行、20米以内的潜水
		 */
		public static final String THRID_TYPES_OF_OUTDOOR_SPORTS="7";
		/**
		 * 第四类户外运动：高风险户外运动，包括登山户外运动（3500-6000米）和自行车赛、山地自行车、冬季户外运动、攀冰（包括低海拔地区）、沙漠穿越、伞降、三角翼飞行、竞速型机动车比赛
		 */
		public static final String FOUR_TYPES_OF_OUTDOOR_SPORTS="8";
		/**
		 * 第五类户外运动：户外探险，包括高山探险（6000米以上）和登山滑雪、极地探险、洞穴探险、超过20米以上的深潜
		 */
		public static final String FIVE_TYPES_OF_OUTDOOR_SPORTS="9";
	}
}
