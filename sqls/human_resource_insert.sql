INSERT INTO EMPLOYEE (EMPLOYEE_PK_ID, DEPT_FK_ID, `MEMBER`) VALUES
('EMP_01', 'DEPT_01', '김진현'),
('EMP_02', 'DEPT_02', '김성호'),
('EMP_03', 'DEPT_01', '이영희'),
('EMP_04', 'DEPT_02', '박철수'),
('EMP_05', 'DEPT_01', '최민수'),
('EMP_06', 'DEPT_01', '김하늘'),
('EMP_07', 'DEPT_02', '이정민'),
('EMP_08', 'DEPT_02', '홍길동'),
('EMP_09', 'DEPT_01', '김유진'),
('EMP_10', 'DEPT_01', '박지민');

INSERT INTO employee_attendance (WORK_ATT_PK_ID, EMPLOYEE_FK_ID, WORK_STAT_FK_ID, `DATE`) VALUES
('ATT_01', 'EMP_01', 'STAT_01', '2024-08-12'),
('ATT_02', 'EMP_02', 'STAT_02', '2024-08-12'),
('ATT_03', 'EMP_03', 'STAT_01', '2024-08-12'),
('ATT_04', 'EMP_04', 'STAT_02', '2024-08-12'),
('ATT_05', 'EMP_05', 'STAT_01', '2024-08-13'),
('ATT_06', 'EMP_06', 'STAT_03', '2024-08-13'),
('ATT_07', 'EMP_07', 'STAT_01', '2024-08-14'),
('ATT_08', 'EMP_08', 'STAT_02', '2024-08-14'),
('ATT_09', 'EMP_09', 'STAT_03', '2024-08-15'),
('ATT_10', 'EMP_10', 'STAT_01', '2024-08-15');

INSERT INTO DEPT (DEPT_PK_ID, DEPT_NAME) VALUES
('DEPT_01', '개발'),
('DEPT_02', '기획');

INSERT INTO WORK_STATUS (WORK_STAT_PK_ID, `STATUS`) VALUES
('STAT_01', '출근'),
('STAT_02', '결근'),
('STAT_03', '휴가');

