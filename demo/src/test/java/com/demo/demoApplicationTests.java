	//CRUD 	 
	@Test
	void saveStudent() {
		Student s = new Student();
		s.setId(1L);
		s.setName("mike");
		s.setEmail("mike@gmail.com");
		s.setMobile("9295776639");
		repository.save(s);	
	}
	@Test
	void deleteStudent(){
		repository.deleteById(1L);
	}
	
	@Test
	void updateStudent() {
		Student s = new Student();
		s.setId(1L);
		s.setName("stallin");
		s.setEmail("stallin@gmail.com");
		s.setMobile("9595776639");
		repository.save(s);	
	
	}

//JUnit
	@Test
	void test1(){
		//int x =10/0; error
		System.out.println("from test1");
	}
	
	@Test
	void test2() {
		System.out.println("from test2");
	}
	
	@BeforeEach
	void beforeTest() {
		System.out.println("before test");
	}
	
	@AfterEach
	void afterEachTest() {
		System.out.println("after test");
	}
	
	@BeforeAll
	static void beforeClass() {
		System.out.println("before test");
	}
	
	@AfterAll
	static void afterClass() {
		System.out.println("after class");
	}
