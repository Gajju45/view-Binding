# view-Binding


#1
 buildFeatures {
        viewBinding true
    }
    
 #2
  private lateinit var binding : ActivityMainBinding
  
  #3
     binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
