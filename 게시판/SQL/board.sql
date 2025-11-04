-- 데이터베이스 생성
CREATE DATABASE aloha;

-- 테이블 생성
-- 게시판 테이블 생성
CREATE TABLE `aloha`.`board` (
`no`		INT NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '번호',
`title`		VARCHAR(100) NOT NULL COMMENT '제목',
`writer`	VARCHAR(100) NOT NULL COMMENT '작성자',
`content`	TEXT	NULL COMMENT '내용',
`created_at`	TIMESTAMP NOT NULL DEFAULT now() COMMENT '등록일자',
`updated_at`	TIMESTAMP NOT NULL DEFAULT now() COMMENT '수정일자'
) COMMENT = '게시판';


-- 데이터 추가
INSERT INTO board (title, writer, content)
VALUES('제목01','작성자01','내용01');

-- 데이터 조회
SELECT * FROM board;

-- 데이터 수정
UPDATE board
	SET title = '수정01'
		,writer = '수정01'
		,content = '수정01'
WHERE no = 1;

-- 데이터 삭제
DELETE FROM board
WHERE NO = 1;

-- 테이블 삭제
DROP TABLE board;


-- 데이터 추가
INSERT INTO board (title, writer, content)
VALUES
	('제목01','작성자01','내용01'),
    ('제목02','작성자02','내용02'),
    ('제목03','작성자03','내용03'),
    ('제목04','작성자04','내용04'),
    ('제목05','작성자05','내용05') 
;

SELECT * FROM board;
