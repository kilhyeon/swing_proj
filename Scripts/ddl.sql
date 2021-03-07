-- 도서관리
DROP SCHEMA IF EXISTS book_rent;

-- 도서관리
CREATE SCHEMA book_rent;

-- 회원정보
CREATE TABLE book_rent.member_info (
	mNo    VARCHAR(5)  NOT NULL COMMENT '회원번호', -- 회원번호
	mName  VARCHAR(4)  NOT NULL COMMENT '이름', -- 이름
	mBirth VARCHAR(8)  NOT NULL COMMENT '생년월일', -- 생년월일
	mTel   VARCHAR(13) NULL     COMMENT '전화번호', -- 전화번호
	mCp    VARCHAR(13) NULL     COMMENT '휴대전화', -- 휴대전화
	mAdd   VARCHAR(20) NULL     COMMENT '주소' -- 주소
)
COMMENT '회원정보';

-- 회원정보
ALTER TABLE book_rent.member_info
	ADD CONSTRAINT PK_member_info -- 회원정보 기본키
		PRIMARY KEY (
			mNo -- 회원번호
		);

-- 도서정보
CREATE TABLE book_rent.book_info (
	bNo   VARCHAR(5)  NOT NULL COMMENT '도서번호', -- 도서번호
	bName VARCHAR(40) NOT NULL COMMENT '도서제목', -- 도서제목
	bRent VARCHAR(4)  NOT NULL COMMENT '대출여부' -- 대출여부
)
COMMENT '도서정보';

-- 도서정보
ALTER TABLE book_rent.book_info
	ADD CONSTRAINT PK_book_info -- 도서정보 기본키
		PRIMARY KEY (
			bNo -- 도서번호
		);

-- 대출내역
CREATE TABLE book_rent.rent_info (
	mNo      VARCHAR(5)  NOT NULL COMMENT '회원번호', -- 회원번호
	mName    VARCHAR(4)  NULL     COMMENT '회원이름', -- 회원이름
	mBirth   VARCHAR(8)  NULL     COMMENT '생년월일', -- 생년월일
	bNo      VARCHAR(5)  NOT NULL COMMENT '도서번호', -- 도서번호
	bName    VARCHAR(20) NULL     COMMENT '도서제목', -- 도서제목
	rentDate VARCHAR(8)  NULL     COMMENT '도서대여일', -- 도서대여일
	lateDate VARCHAR(2)  NULL     COMMENT '도서연체일' -- 도서연체일
)
COMMENT '대출내역';

-- 대출내역
ALTER TABLE book_rent.rent_info
	ADD CONSTRAINT FK_member_info_TO_rent_info -- 회원정보 -> 대출내역
		FOREIGN KEY (
			mNo -- 회원번호
		)
		REFERENCES book_rent.member_info ( -- 회원정보
			mNo -- 회원번호
		);

-- 대출내역
ALTER TABLE book_rent.rent_info
	ADD CONSTRAINT FK_book_info_TO_rent_info -- 도서정보 -> 대출내역
		FOREIGN KEY (
			bNo -- 도서번호
		)
		REFERENCES book_rent.book_info ( -- 도서정보
			bNo -- 도서번호
		);