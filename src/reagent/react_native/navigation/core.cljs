(ns reagent.react-native.navigation
  (:require ["@react-navigation/stack" :refer [createStackNavigator]]
            ["@react-navigation/bottom-tabs" :refer (createBottomTabNavigator)]
            ["react-native-safe-area-context" :refer (SafeAreaView SafeAreaProvider SafeAreaConsumer)]
            [reagent.core :as r]))

(defn- prepare-navigator [navigator screen]
  (fn [& params]
    (let [[props children] (if (map? (first params))
                             [(first params) (second params)]
                             [{} (first params)])]
      (into [navigator props]
            (mapv (fn [props]
                    [screen (update props :component r/reactify-component)])
                  children)))))

;; tab
(defn create-stack-navigator []
  (let [^js stack (createStackNavigator)]
    [(r/adapt-react-class (.-Navigator stack))
     (r/adapt-react-class (.-Screen stack))]))

(defn stack [& params]
  (let [[navigator screen] (create-stack-navigator)]
    (prepare-navigator navigator screen)))

;; bottom tab
(defn create-bottom-tab-navigator []
  (let [^js tab (createBottomTabNavigator)]
    [(r/adapt-react-class (.-Navigator tab))
     (r/adapt-react-class (.-Screen tab))]))

(defn bottom-tab [& params]
   (let [[navigator screen] (create-bottom-tab-navigator)]
     (prepare-navigator navigator screen)))

;; safe-area
(def safe-area-provider (r/adapt-react-class SafeAreaProvider))
(def safe-area-consumer (r/adapt-react-class SafeAreaConsumer))
(def safe-area-view (r/adapt-react-class SafeAreaView))