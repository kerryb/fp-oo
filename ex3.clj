(def add-squares (fn [& numbers]
                   (apply +
                          (map (fn [n] (* n n)) numbers))))
