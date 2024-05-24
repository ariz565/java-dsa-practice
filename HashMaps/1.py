# from sklearn.linear_model import LinearRegression

# # Given data
# X_train = [[2, 3, 1], [4, 5, 2], [6, 7, 5]]
# y_train = [2.3, 3.1, 7.8]

# # Create and train the model
# model = LinearRegression()
# model.fit(X_train, y_train)

# # New input for prediction
# X_new = [[3, 5, 4]]

# # Predict output for new input
# predicted_output = model.predict(X_new)

# print(predicted_output)

from sklearn.tree import DecisionTreeClassifier

# Given data
X_train = [[70, 34, 27], [64, 50, 35], [67, 43, 33]]
y_train = ['Yes', 'No', 'Yes']

# Create and train the decision tree classifier
model = DecisionTreeClassifier()
model.fit(X_train, y_train)

# New input for prediction
X_new = [[66, 39, 40]]

# Predict if the game is possible for new input
predicted_result = model.predict(X_new)

print(predicted_result[0])
